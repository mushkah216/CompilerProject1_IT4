package AST.parser_pkg;

import AST.Python.Expression;

public class BinaryExpression extends Expression {

    protected Expression left;
    protected Expression right;
    protected String operator;

    public BinaryExpression(Expression left, String operator, Expression right) {
        this.left = left;
        this.operator = operator;
        this.right = right;
    }

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }

    public String getOperator() {
        return operator;
    }
}
