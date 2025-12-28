package AST.parser_pkg;

import AST.Expression;
import AST.Statement;

public class ForStatement extends Statement {

    private String iterator;
    private Expression iterable;
    private Block body;

    public ForStatement(String iterator, Expression iterable, Block body) {
        this.iterator = iterator;
        this.iterable = iterable;
        this.body = body;
    }

    public String getIterator() {
        return iterator;
    }

    public Expression getIterable() {
        return iterable;
    }

    public Block getBody() {
        return body;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "└── ForStatement (Iter: " + iterator + ") (Line: " + lineNumber + ")");
        iterable.print(indent + "    [In] ");
        body.print(indent + "    [Body] ");
    }
}
