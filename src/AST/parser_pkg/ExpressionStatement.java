package AST.parser_pkg;

import AST.Expression;
import AST.Statement;

public class ExpressionStatement extends Statement {

    private Expression expression;

    public ExpressionStatement(Expression expression) {
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public String toString() {
        return "ExpressionStatement(" + expression + ")";
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "└── ExpressionStatement (Line: " + lineNumber + ")");
        expression.print(indent + "    ");
    }
}
