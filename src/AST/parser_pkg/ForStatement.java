package AST.parser_pkg;

public class ForStatement extends Statement {

    private String iterator;      // اسم المتغير (ID)
    private Expression iterable;  // التعبير بعد IN
    private Block body;           // جسم الحلقة

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
}
