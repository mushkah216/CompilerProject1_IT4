package AST.parser_pkg;

import AST.Python.Expression;

public class DictEntry {

    private final Expression key;
    private final Expression value;

    public DictEntry(Expression key, Expression value) {
        this.key = key;
        this.value = value;
    }

    public Expression getKey() {
        return key;
    }

    public Expression getValue() {
        return value;
    }

    @Override
    public String toString() {
        return key + ": " + value;
    }
}
