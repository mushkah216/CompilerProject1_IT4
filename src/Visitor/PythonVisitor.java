package Visitor;

import AST.ASTNode;
import AST.Statement;
import AST.parser_pkg.*;
import org.antlr.v4.runtime.tree.ParseTree;
import parser_pkg.pythonParser;
import AST.Expression;
import parser_pkg.pythonParserBaseVisitor;

import java.util.List;
import java.util.ArrayList;


public class PythonVisitor extends pythonParserBaseVisitor<ASTNode> {
    @Override
    public ASTNode visit(ParseTree tree) {
        if (tree == null) return null;

        ASTNode result = super.visit(tree);

        if (result == null) {
            System.err.println("Warning: Visitor returned null for node: " + tree.getText());
        }
        return result;
    }

    @Override
    public ASTNode visitProgram(pythonParser.ProgramContext ctx) {
        Program program = new Program();
        program.setLineNumber(ctx.getStart().getLine());

        for (pythonParser.StatementContext stmtCtx : ctx.statement()) {
            Statement stmt = (Statement) visit(stmtCtx);
            if (stmt != null) {
                program.addStatement(stmt);
            }
        }

        return program;
    }

    @Override
    public ASTNode visitStatement(pythonParser.StatementContext ctx) {
        ASTNode node = null;
        if (ctx.compound_stmt() != null) {
            node= visit(ctx.compound_stmt());
        }

        if (ctx.simple_stmt() != null) {
            node= visit(ctx.simple_stmt());
        }

        return node;
    }

    @Override
    public ASTNode visitSimple_stmt(pythonParser.Simple_stmtContext ctx) {

        if (ctx.importStatement() != null) {
            return visit(ctx.importStatement());
        }

        if (ctx.assignment() != null) {
            return visit(ctx.assignment());
        }

        if (ctx.returnStatement() != null) {
            return visit(ctx.returnStatement());
        }

        if (ctx.expressionStatement() != null) {
            return visit(ctx.expressionStatement());
        }

        if (ctx.logic_expr() != null) {
            return visit(ctx.logic_expr());
        }

        return null;
    }

    @Override
    public ASTNode visitCompound_stmt(pythonParser.Compound_stmtContext ctx) {
        ASTNode node = null;

        if (ctx.ifStatement() != null) {
            node = visit(ctx.ifStatement());
        } else if (ctx.whileStatement() != null) {
            node = visit(ctx.whileStatement());
        } else if (ctx.forStatement() != null) {
            node = visit(ctx.forStatement());
        } else if (ctx.functionDef() != null) {
            node = visit(ctx.functionDef());
        }

        // ملاحظة: رقم السطر يتم إسناده داخل التوابع الفرعية (مثل visitIfStatement)
        // لأن كل جملة لها تفاصيلها الخاصة، لكننا نضمن هنا إعادة العقدة بشكل صحيح.
        return node;
    }

    @Override
    public ASTNode visitReturnStatement(pythonParser.ReturnStatementContext ctx) {
        ReturnStatement returnStmt;

        if (ctx.testList() == null) {
            returnStmt = new ReturnStatement(null);
        } else {
            Expression value = (Expression) visit(ctx.testList());
            returnStmt = new ReturnStatement(value);
        }

        returnStmt.setLineNumber(ctx.getStart().getLine());

        return returnStmt;
    }

    @Override
    public ASTNode visitBlock(pythonParser.BlockContext ctx) {
        Block block = new Block();
        block.setLineNumber(ctx.getStart().getLine());

        for (pythonParser.StatementContext stmtCtx : ctx.statement()) {
            ASTNode node = visit(stmtCtx);
            if (node instanceof Statement) {
                block.addStatement((Statement) node);
            } else {
                System.out.println("Warning: Node is not a Statement: " + node.getClass().getName());
            }
        }
        return block;
    }

    @Override
    public ASTNode visitDecorator(pythonParser.DecoratorContext ctx) {
        List<String> nameParts = new ArrayList<>();
        for (int i = 0; i < ctx.ID().size(); i++) {
            nameParts.add(ctx.ID(i).getText());
        }
        List<Expression> args = null;
        if (ctx.argList() != null) {
            ArgumentList argList = (ArgumentList) visit(ctx.argList());
            args = new ArrayList<>();
            if (argList != null && argList.getArguments() != null) {
                for (Argument a : argList.getArguments()) {
                    args.add(a.getValue());
                }
            }
        }
        Decorator decorator = new Decorator(nameParts, args);
        decorator.setLineNumber(ctx.getStart().getLine());

        return decorator;
    }

    @Override
    public ASTNode visitAssignment(pythonParser.AssignmentContext ctx) {
        Target target = (Target) visit(ctx.target());

        Expression value = (Expression) visit(ctx.expression());

        Assignment assignment = new Assignment(target, value);
        assignment.setLineNumber(ctx.getStart().getLine());

        return assignment;
    }

    @Override
    public ASTNode visitExpressionStatement(pythonParser.ExpressionStatementContext ctx) {
        Expression expr = (Expression) visit(ctx.expression());
        ExpressionStatement exprStmt = new ExpressionStatement(expr);
        exprStmt.setLineNumber(ctx.getStart().getLine());
        return exprStmt;
    }

    @Override
    public ASTNode visitIfStatement(pythonParser.IfStatementContext ctx) {
        Expression condition = (Expression) visit(ctx.expression());

        Block thenBlock = (Block) visit(ctx.block());

        List<ElifPart> elifParts = new ArrayList<>();
        for (pythonParser.ElifPartContext elifCtx : ctx.elifPart()) {
            ElifPart elif = (ElifPart) visit(elifCtx);
            if (elif != null) {
                elifParts.add(elif);
            }
        }

        ElsePart elsePart = null;
        if (ctx.elsePart() != null) {
            elsePart = (ElsePart) visit(ctx.elsePart());
        }

        IfStatement ifStmt = new IfStatement(condition, thenBlock, elifParts, elsePart);
        ifStmt.setLineNumber(ctx.getStart().getLine());

        return ifStmt;
    }

    @Override
    public ASTNode visitElifPart(pythonParser.ElifPartContext ctx) {
        Expression condition = (Expression) visit(ctx.expression());

        Block block = (Block) visit(ctx.block());

        ElifPart elifNode = new ElifPart(condition, block);
        elifNode.setLineNumber(ctx.getStart().getLine());

        return elifNode;
    }

    @Override
    public ASTNode visitElsePart(pythonParser.ElsePartContext ctx) {
        Block block = (Block) visit(ctx.block());
        ElsePart elseNode = new ElsePart(block);
        elseNode.setLineNumber(ctx.getStart().getLine());

        return elseNode;
    }

    @Override
    public ASTNode visitWhileStatement(pythonParser.WhileStatementContext ctx) {
        Expression condition = (Expression) visit(ctx.expression());
        Block block = (Block) visit(ctx.block());

        WhileStatement whileStmt = new WhileStatement(condition, block);
        whileStmt.setLineNumber(ctx.getStart().getLine());

        return whileStmt;
    }

    @Override
    public ASTNode visitForStatement(pythonParser.ForStatementContext ctx) {
        String variable = ctx.ID().getText();
        Expression iterable = (Expression) visit(ctx.expression());
        Block block = (Block) visit(ctx.block());

        ForStatement forStmt = new ForStatement(variable, iterable, block);
        forStmt.setLineNumber(ctx.getStart().getLine());

        return forStmt;
    }

    @Override
    public ASTNode visitImportStatement(pythonParser.ImportStatementContext ctx) {
        boolean isFromImport = ctx.FROM() != null;
        boolean importAll = false;
        String module = null;
        String alias = null;
        List<String> names = new ArrayList<>();

        if (!isFromImport) {
            for (int i = 0; i < ctx.ID().size(); i++) {
                names.add(ctx.ID(i).getText());
            }
            if (ctx.AS() != null) {
                alias = ctx.ID(ctx.ID().size() - 1).getText();
                names.remove(names.size() - 1);
            }
        } else {
            StringBuilder mod = new StringBuilder();
            mod.append(ctx.ID(0).getText());
            int i = 1;
            while (i < ctx.ID().size() && ctx.DOT(i - 1) != null) {
                mod.append(".").append(ctx.ID(i).getText());
                i++;
            }
            module = mod.toString();

            if (ctx.MUL() != null) {
                importAll = true;
            } else {
                for (int j = i; j < ctx.ID().size(); j++) {
                    names.add(ctx.ID(j).getText());
                }
            }
        }

        ImportStatement importStmt = new ImportStatement(isFromImport, module, names, alias, importAll);
        importStmt.setLineNumber(ctx.getStart().getLine());

        return importStmt;
    }
    @Override

    public ASTNode visitFunctionDef(pythonParser.FunctionDefContext ctx) {
        FunctionDef func = new FunctionDef(ctx.ID().getText());
        func.setLineNumber(ctx.getStart().getLine());

        for (pythonParser.DecoratorContext dec : ctx.decorator()) {
            StringBuilder decoratorName = new StringBuilder();
            decoratorName.append(dec.ID(0).getText());
            for (int i = 1; i < dec.ID().size(); i++) {
                decoratorName.append(".").append(dec.ID(i).getText());
            }
            func.addDecorator(decoratorName.toString());
        }

        if (ctx.parameters() != null) {
            ParameterList params = (ParameterList) visit(ctx.parameters());
            func.setParameters(params);
        }

        Block body = (Block) visit(ctx.block());
        func.setBody(body);

        return func;
    }

    @Override
    public ASTNode visitParameters(pythonParser.ParametersContext ctx) {
        ParameterList params = new ParameterList();
        params.setLineNumber(ctx.getStart().getLine());

        for (int i = 0; i < ctx.ID().size(); i++) {
            Parameter p = new Parameter(ctx.ID(i).getText());
            p.setLineNumber(ctx.ID(i).getSymbol().getLine());
            params.addParameter(p);
        }

        return params;
    }

    @Override
    public ASTNode visitArgument(pythonParser.ArgumentContext ctx) {
        Expression value = (Expression) visit(ctx.expression());
        Argument argument;

        if (ctx.ID() != null) {
            String name = ctx.ID().getText();
            argument = new Argument(name, value);
        } else {
            argument = new Argument(value);
        }

        argument.setLineNumber(ctx.getStart().getLine());
        return argument;
    }

    @Override
    public ASTNode visitArgList(pythonParser.ArgListContext ctx) {
        ArgumentList argList = new ArgumentList();
        argList.setLineNumber(ctx.getStart().getLine());

        for (pythonParser.ArgumentContext argCtx : ctx.argument()) {
            Argument arg = (Argument) visit(argCtx);
            if (arg != null) {
                argList.addArgument(arg);
            }
        }

        return argList;
    }

    @Override
    public ASTNode visitTarget(pythonParser.TargetContext ctx) {
        String baseName = ctx.ID(0).getText();
        List<TargetAccess> accesses = new ArrayList<>();

        for (int i = 1; i < ctx.ID().size(); i++) {
            MemberTarAccess member = new MemberTarAccess(ctx.ID(i).getText());
            member.setLineNumber(ctx.ID(i).getSymbol().getLine());
            accesses.add(member);
        }

        for (pythonParser.ExpressionContext exprCtx : ctx.expression()) {
            Expression index = (Expression) visit(exprCtx);
            IndexAccess indexAccess = new IndexAccess(index);
            indexAccess.setLineNumber(exprCtx.getStart().getLine());
            accesses.add(indexAccess);
        }

        Target target = new Target(baseName, accesses);
        target.setLineNumber(ctx.getStart().getLine());
        return target;
    }

    @Override
    public ASTNode visitExpression(pythonParser.ExpressionContext ctx) {
        if (ctx.IF() == null) {
            return visit(ctx.logic_expr(0));
        }

        Expression thenExpr = (Expression) visit(ctx.logic_expr(0));
        Expression condition = (Expression) visit(ctx.logic_expr(1));
        Expression elseExpr = (Expression) visit(ctx.expression());

        ConditionalExpression condExpr = new ConditionalExpression(condition, thenExpr, elseExpr);
        condExpr.setLineNumber(ctx.getStart().getLine());
        return condExpr;
    }

    @Override
    public ASTNode visitAtom(pythonParser.AtomContext ctx) {
        Expression result = null;

        if (ctx.NUMBER() != null) {
            result = new NumberLiteral(Double.parseDouble(ctx.NUMBER().getText()));
        } else if (ctx.STRING() != null) {
            String text = ctx.STRING().getText();
            text = text.substring(1, text.length() - 1);
            result = new StringLiteral(text);
        } else if (ctx.TRUE() != null) {
            result = new BooleanLiteral(true);
        } else if (ctx.FALSE() != null) {
            result = new BooleanLiteral(false);
        } else if (ctx.NONE() != null) {
            result = new NoneLiteral();
        } else if (ctx.ID() != null) {
            result = new Identifier(ctx.ID().getText());
        } else if (ctx.listLiteral() != null) {
            return visit(ctx.listLiteral());
        } else if (ctx.dictLiteral() != null) {
            return visit(ctx.dictLiteral());
        } else if (ctx.testList_comp() != null) {
            return visit(ctx.testList_comp());
        }

        if (result != null) {
            result.setLineNumber(ctx.getStart().getLine());
        }
        return result;
    }

    @Override
    public ASTNode visitLogic_expr(pythonParser.Logic_exprContext ctx) {
        Expression left = (Expression) visit(ctx.comparison(0));

        for (int i = 1; i < ctx.comparison().size(); i++) {
            String operator = ctx.getChild(2 * i - 1).getText();
            Expression right = (Expression) visit(ctx.comparison(i));

            GenericBinaryExpression logicExpr = new GenericBinaryExpression(left, operator, right);
            logicExpr.setLineNumber(ctx.getStart().getLine());
            left = logicExpr;
        }

        return left;
    }

    @Override
    public ASTNode visitComparison(pythonParser.ComparisonContext ctx) {
        Expression left = (Expression) visit(ctx.arith_expr(0));

        for (int i = 1; i < ctx.arith_expr().size(); i++) {
            String op = ctx.getChild(2 * i - 1).getText();
            Expression right = (Expression) visit(ctx.arith_expr(i));

            GenericBinaryExpression compExpr = new GenericBinaryExpression(left, op, right);
            compExpr.setLineNumber(ctx.getStart().getLine());
            left = compExpr;
        }

        return left;
    }

    @Override
    public ASTNode visitListLiteral(pythonParser.ListLiteralContext ctx) {
        if (ctx.testList_comp() == null) {
            ListExpression emptyList = new ListExpression(new ArrayList<>());
            emptyList.setLineNumber(ctx.getStart().getLine());
            return emptyList;
        }
        return visit(ctx.testList_comp());
    }

    @Override
    public ASTNode visitTestList_comp(pythonParser.TestList_compContext ctx) {
        if (ctx.comp_for() != null) {
            Expression element = (Expression) visit(ctx.expression(0));
            pythonParser.Comp_forContext cf = ctx.comp_for();

            String loopVar = cf.target().getStart().getText();
            Expression iterable = (Expression) visit(cf.expression());

            Expression condition = null;
            if (cf.comp_iter() != null && cf.comp_iter().IF() != null) {
                condition = (Expression) visit(cf.comp_iter().expression());
            }

            ListExpression listComp = new ListExpression(element, loopVar, iterable, condition);
            listComp.setLineNumber(ctx.getStart().getLine());
            return listComp;
        }

        List<Expression> elements = new ArrayList<>();
        for (pythonParser.ExpressionContext e : ctx.expression()) {
            elements.add((Expression) visit(e));
        }

        ListExpression listExpr = new ListExpression(elements);
        listExpr.setLineNumber(ctx.getStart().getLine());
        return listExpr;
    }

    @Override
    public ASTNode visitDictLiteral(pythonParser.DictLiteralContext ctx) {
        DictExpression dict = new DictExpression();
        dict.setLineNumber(ctx.getStart().getLine());

        for (pythonParser.DictEntryContext entryCtx : ctx.dictEntry()) {
            Expression key = (Expression) visit(entryCtx.expression(0));
            Expression value = (Expression) visit(entryCtx.expression(1));
            dict.addEntry(key, value);
        }

        return dict;
    }

    @Override
    public ASTNode visitFactor(pythonParser.FactorContext ctx) {
        Expression expr = (Expression) visit(ctx.atom());

        for (pythonParser.TrailerContext tr : ctx.trailer()) {
            if (tr.LP() != null) {
                List<Expression> args = new ArrayList<>();
                if (tr.argList() != null) {
                    for (pythonParser.ArgumentContext argCtx : tr.argList().argument()) {
                        Argument argNode = (Argument) visit(argCtx);
                        if (argNode != null) {
                            args.add(argNode.getValue());
                        }
                    }
                }
                FunctionCall call = new FunctionCall(expr, args);
                call.setLineNumber(tr.getStart().getLine());
                expr = call;
            }
            else if (tr.LC() != null) {
                Expression index = (Expression) visit(tr.expression());
                IndexExpression indexExpr = new IndexExpression(expr, index);
                indexExpr.setLineNumber(tr.getStart().getLine());
                expr = indexExpr;
            }
            else if (tr.DOT() != null) {
                String name = tr.ID().getText();
                MemberAccess member = new MemberAccess(expr, name);
                member.setLineNumber(tr.getStart().getLine());
                expr = member;
            }
        }
        return expr;
    }

    @Override
    public ASTNode visitArith_expr(pythonParser.Arith_exprContext ctx)  {
        Expression left = (Expression) visit(ctx.term(0));

        for (int i = 1; i < ctx.term().size(); i++) {
            String op = ctx.getChild(2 * i - 1).getText();
            Expression right = (Expression) visit(ctx.term(i));

            GenericBinaryExpression arithExpr = new GenericBinaryExpression(left, op, right);
            arithExpr.setLineNumber(ctx.getStart().getLine());
            left = arithExpr;
        }
        return left;
    }

    @Override
    public ASTNode visitTerm(pythonParser.TermContext ctx) {
        Expression left = (Expression) visit(ctx.factor(0));

        for (int i = 1; i < ctx.factor().size(); i++) {
            String op = ctx.getChild(2 * i - 1).getText();
            Expression right = (Expression) visit(ctx.factor(i));

            GenericBinaryExpression termExpr = new GenericBinaryExpression(left, op, right);
            termExpr.setLineNumber(ctx.getStart().getLine());
            left = termExpr;
        }
        return left;
    }
}
