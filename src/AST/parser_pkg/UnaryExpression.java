package AST.parser_pkg;

import AST.Expression;

public class UnaryExpression extends Expression {

    protected String operator;
    protected Expression operand;

    public UnaryExpression(String operator, Expression operand) {
        this.operator = operator;
        this.operand = operand;
    }

    public String getOperator() {
        return operator;
    }

    public Expression getOperand() {
        return operand;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "└── UnaryExpression (Op: " + operator + ") [Line: " + lineNumber + "]");
        if (operand != null) {
            operand.print(indent + "    ");
        }
    }

}
