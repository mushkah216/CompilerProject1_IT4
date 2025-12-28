package AST.parser_pkg;

import AST.Expression;

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

    @Override
    public void print(String indent) {
        System.out.println(indent + "└── BinaryExpression (Op: " + operator + ") [Line: " + lineNumber + "]");
        if (left != null) left.print(indent + "    ");
        if (right != null) right.print(indent + "    ");
    }
}
