package AST.parser_pkg;

import AST.Expression;
import AST.Statement;

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

    @Override
    public void print(String indent) {
        System.out.println(indent + "└── ReturnStatement [Line: " + lineNumber + "]");
        if (value != null) {
            value.print(indent + "    [Value]: ");
        }
    }

}
