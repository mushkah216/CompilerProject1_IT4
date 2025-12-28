package AST.parser_pkg;

public class BooleanLiteral extends Expression {

    private final boolean value;

    public BooleanLiteral(boolean value) {
        this.value = value;
    }

    public boolean getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "BooleanLiteral(" + value + ")";
    }
}
