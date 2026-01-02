package Visitor;

import AST.Web.Expression;
import AST.Web.*;
import SymbolTable.WebSymbolTable;
import Web.WebParser;
import Web.WebParserBaseVisitor;

import java.util.ArrayList;
import java.util.List;

public class WebVisitor extends WebParserBaseVisitor<Object> {

    private WebSymbolTable symbolTable = new WebSymbolTable();
    private void enterScope() {
        symbolTable = new WebSymbolTable(symbolTable);
        System.out.println(">>> Entering New Scope");
    }

    private void exitScope() {
        if (symbolTable.getParent() != null) {
            System.out.println("<<< Exiting Scope. Local variables cleared.");
            symbolTable = symbolTable.getParent();
        }
    }



    @Override
    public Object visitHtmlDocument(WebParser.HtmlDocumentContext ctx) {
        HtmlDocument doc = new HtmlDocument(ctx.start.getLine(), ctx.start.getCharPositionInLine());
        Object content = visit(ctx.htmlContent());

        if (content instanceof List) {
            for (Object node : (List<?>) content) {
                if (node instanceof HtmlNode) {
                    doc.addChild((HtmlNode) node);
                }
            }
        }
        return doc;
    }

    @Override
    public Object visitSelfClosingHtmlElement(WebParser.SelfClosingHtmlElementContext ctx) {

        HtmlSelfClosingElement element = new HtmlSelfClosingElement(
                ctx.TAG_NAME().getText(),
                ctx.start.getLine(),
                ctx.start.getCharPositionInLine()
        );


        if (ctx.attribute() != null) {
            for (WebParser.AttributeContext attrCtx : ctx.attribute()) {
                Object attr = visit(attrCtx);
                if (attr instanceof HtmlAttribute) {
                    element.addAttribute((HtmlAttribute) attr);
                }
            }
        }

        return element;
    }


    @Override
    public Object visitHtmlContent(WebParser.HtmlContentContext ctx) {
        List<HtmlNode> nodes = new ArrayList<>();


        if (ctx.children != null) {
            for (org.antlr.v4.runtime.tree.ParseTree child : ctx.children) {
                Object visited = visit(child);

                if (visited instanceof HtmlNode) {
                    nodes.add((HtmlNode) visited);
                }

                else if (child instanceof org.antlr.v4.runtime.tree.TerminalNode) {
                    String text = child.getText().trim();
                    if (!text.isEmpty()) {
                        org.antlr.v4.runtime.Token symbol = ((org.antlr.v4.runtime.tree.TerminalNode) child).getSymbol();
                        nodes.add(new HtmlText(child.getText(), symbol.getLine(), symbol.getCharPositionInLine()));
                    }
                }
            }
        }
        return nodes;
    }


    @Override
    public Object visitNormalHtmlElement(WebParser.NormalHtmlElementContext ctx) {
        HtmlElement element = new HtmlElement(ctx.TAG_NAME(0).getText(), ctx.start.getLine(), ctx.start.getCharPositionInLine());


        Object content = visit(ctx.htmlContent());
        if (content instanceof List) {
            for (Object node : (List<?>) content) {
                if (node instanceof HtmlNode) {
                    element.addChild((HtmlNode) node);
                }
            }
        }
        return element;
    }


    @Override
    public Object visitJinjaStatement(WebParser.JinjaStatementContext ctx) {
        return visit(ctx.jinjaStatementBody());
    }



    @Override
    public Object visitJinjaSet(WebParser.JinjaSetContext ctx) {
        String varName = ctx.JINJA_NAME().getText();


        Object value = visit(ctx.expression());

        symbolTable.define(varName, value);

        return new AST.Web.JinjaSet(varName, null, ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
    }


    @Override
    public Object visitVariableExpr(WebParser.VariableExprContext ctx) {
        String varName = ctx.JINJA_NAME(0).getText();


        Object value = symbolTable.lookup(varName);

        if (value != null) {
            return value;
        }

        List<String> names = new ArrayList<>();
        ctx.JINJA_NAME().forEach(n -> names.add(n.getText()));
        return new AST.Web.Variable(names, ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
    }

    @Override
    public Object visitNumberLiteral(WebParser.NumberLiteralContext ctx) {
        return Double.parseDouble(ctx.JINJA_NUMBER().getText());
    }

    @Override
    public Object visitStringLiteral(WebParser.StringLiteralContext ctx) {
        String text = ctx.JINJA_STRING().getText();
        return text.substring(1, text.length() - 1);
    }


    @Override
    public Object visitJinjaExpression(WebParser.JinjaExpressionContext ctx) {

        return visit(ctx.expression());
    }
    @Override
    public Object visitAddSubExpr(WebParser.AddSubExprContext ctx) {

        Object left = visit(ctx.term(0));


        if (ctx.term().size() > 1) {
            Object right = visit(ctx.term(1));
            String operator = ctx.getChild(1).getText();


            if (left instanceof Double && right instanceof Double) {
                return operator.equals("+") ? (Double) left + (Double) right : (Double) left - (Double) right;
            }

            Expression leftNode = wrapInLiteral(left);
            Expression rightNode = wrapInLiteral(right);
            return new AST.Web.AddSub(leftNode, operator, rightNode,
                    ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
        }


        return left;
    }

    private AST.Web.Expression wrapInLiteral(Object value) {
        if (value instanceof Expression) {
            return (AST.Web.Expression) value;
        } else if (value instanceof Double) {

            return new AST.Web.NumberLiteral(value.toString(), 0, 0);
        }
        return null;
    }
    @Override
    public Object visitMulDivExpr(WebParser.MulDivExprContext ctx) {

        Object left = visit(ctx.factor(0));


        if (ctx.factor().size() > 1) {
            Object right = visit(ctx.factor(1));
            String operator = ctx.getChild(1).getText();

            if (left instanceof Double && right instanceof Double) {
                double l = (Double) left;
                double r = (Double) right;
                if (operator.equals("*")) return l * r;
                if (operator.equals("/")) return r != 0 ? l / r : 0.0;
            }
        }
        return left;
    }
    @Override
    public Object visitParenExpr(WebParser.ParenExprContext ctx) {

        return visit(ctx.expression());
    }

    @Override
    public Object visitComparisonExpr(WebParser.ComparisonExprContext ctx) {
        Object left = visit(ctx.simpleExpression(0));

        if (ctx.simpleExpression().size() > 1) {
            Object right = visit(ctx.simpleExpression(1));
            String op = ctx.getChild(1).getText();

            if (left instanceof Double && right instanceof Double) {
                double l = (Double) left;
                double r = (Double) right;
                switch (op) {
                    case "<":  return l < r;
                    case ">":  return l > r;
                    case "<=": return l <= r;
                    case ">=": return l >= r;
                    case "==": return l == r;
                    case "!=": return l != r;
                }
            }
        }
        return left;
    }
    @Override
    public Object visitJinjaIf(WebParser.JinjaIfContext ctx) {
        System.out.println("Found IF statement at line " + ctx.start.getLine());
        enterScope();
        return visitChildren(ctx);
    }
    @Override
    public Object visitJinjaEndIf(WebParser.JinjaEndIfContext ctx) {
        exitScope();
        return visitChildren(ctx);
    }

    @Override
    public Object visitJinjaFor(WebParser.JinjaForContext ctx) {
        enterScope();

        String varName = ctx.JINJA_NAME().getText();
        symbolTable.define(varName, "LoopValue");


        System.out.println("Inside FOR Loop Scope:");
        symbolTable.print();

        Object result = visitChildren(ctx);

        exitScope();
        return result;
    }

    @Override
    public Object visitJinjaEndFor(WebParser.JinjaEndForContext ctx) {
        exitScope();
        return visitChildren(ctx);
    }

    public SymbolTable.WebSymbolTable getSymbolTable() {
        return this.symbolTable;
    }

}