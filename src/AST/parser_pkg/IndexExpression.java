package AST.parser_pkg;


import AST.Expression;

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

    @Override
    public void print(String indent) {
        System.out.println(indent + "└── IndexExpression [Line: " + lineNumber + "]");
        if (object != null) {
            System.out.print(indent + "    [Object]: ");
            object.print("");
        }
        if (index != null) {
            System.out.print(indent + "    [Index]: ");
            index.print("");
        }
    }


}
