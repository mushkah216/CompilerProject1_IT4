package AST.parser_pkg;

import AST.Expression;

public abstract class Literal extends Expression {

    @Override
    public void print(String indent) {
        System.out.println(indent + "└── Literal [Line: " + lineNumber + "]");
    }

}
