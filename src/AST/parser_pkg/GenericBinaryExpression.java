package AST.parser_pkg;

import AST.Expression;

public class GenericBinaryExpression extends BinaryExpression {

    public GenericBinaryExpression(Expression left, String operator, Expression right) {
        super(left, operator, right);
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "└── GenericBinaryExpression (Op: " + operator + ") [Line: " + lineNumber + "]");
        if (left != null) left.print(indent + "    ");
        if (right != null) right.print(indent + "    ");
    }

}
