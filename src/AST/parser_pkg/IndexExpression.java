package AST.parser_pkg;


public class IndexExpression extends Expression {

    private Expression object;
    private Expression index;

    public IndexExpression(Expression object, Expression index) {
        this.object = object;
        this.index = index;
    }

    @Override
    public String toString() {
        return object + "[" + index + "]";
    }
}
