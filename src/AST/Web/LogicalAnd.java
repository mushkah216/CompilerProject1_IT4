package AST.Web;

public class LogicalAnd extends Expression {

    private  Expression left;
    private Expression right;
    public LogicalAnd(Expression left, Expression right, int line, int column) {
        super(line,column);
        this.left = left;
        this.right = right;
    }
    @Override
    public String toString()
    {
        return "(" + left + " and " + right + ")";
    }
}
