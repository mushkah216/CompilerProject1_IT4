package AST.parser_pkg;

public class ReturnStatement extends Statement {

    private Expression value; // قد تكون null

    public ReturnStatement(Expression value) {
        this.value = value;
    }

    public Expression getValue() {
        return value;
    }

    public boolean hasValue() {
        return value != null;
    }
}
