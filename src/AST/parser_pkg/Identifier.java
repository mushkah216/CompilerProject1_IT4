package AST.parser_pkg;

public class Identifier extends Expression {

    private final String name;

    public Identifier(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Identifier(" + name + ")";
    }
}
