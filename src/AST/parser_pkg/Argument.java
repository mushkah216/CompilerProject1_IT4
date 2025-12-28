package AST.parser_pkg;

import AST.ASTNode;
import AST.Expression;

public class Argument extends ASTNode {

    private String name; // null إذا positional
    private Expression value;

    public Argument(String name, Expression value) {
        this.name = name;
        this.value = value;
    }

    public Argument(Expression value) {
        this(null, value);
    }

    public boolean isKeyword() {
        return name != null;
    }

    public String getName() {
        return name;
    }

    public Expression getValue() {
        return value;
    }

    @Override
    public void print(String indent) {
        String type = isKeyword() ? "KeywordArgument (" + name + ")" : "PositionalArgument";
        System.out.println(indent + "└── " + type + " [Line: " + lineNumber + "]");
        if (value != null) {
            value.print(indent + "    ");
        }
    }
}
