package AST.parser_pkg;

import AST.Python.Expression;

import java.util.ArrayList;
import java.util.List;

public class DictExpression extends Expression {

    private final List<DictEntry> entries;

    public DictExpression() {
        this.entries = new ArrayList<>();
    }

    public void addEntry(Expression key, Expression value) {
        this.entries.add(new DictEntry(key, value));
    }

    public List<DictEntry> getEntries() {
        return entries;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        for (int i = 0; i < entries.size(); i++) {
            sb.append(entries.get(i));
            if (i < entries.size() - 1) sb.append(", ");
        }
        sb.append("}");
        return sb.toString();
    }
}
