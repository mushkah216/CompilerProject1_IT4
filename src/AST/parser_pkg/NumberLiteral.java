package AST.parser_pkg;

import AST.Expression;

public class NumberLiteral extends Expression {

    private double value;

    public NumberLiteral(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return Double.toString(value);
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "└── NumberLiteral: " + value + " [Line: " + lineNumber + "]");
    }

}
