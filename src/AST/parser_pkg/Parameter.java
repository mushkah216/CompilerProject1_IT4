package AST.parser_pkg;

import AST.ASTNode;

public class Parameter extends ASTNode {

    public String name;

    public Parameter(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "└── Parameter: " + name + " [Line: " + lineNumber + "]");
    }

}
