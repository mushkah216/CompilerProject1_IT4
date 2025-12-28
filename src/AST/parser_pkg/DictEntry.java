package AST.parser_pkg;

import AST.ASTNode;
import AST.Expression;

public class DictEntry extends ASTNode {

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
        public void print(String indent) {
            System.out.println(indent + "└── DictEntry (Line: " + lineNumber + ")");
            key.print(indent + "    [Key] ");
            value.print(indent + "    [Value] ");
        }

}
