package AST.Web;

public class LogicalAnd extends AST.Web.Expression{

    private AST.Web.Expression left;
    private AST.Web.Expression right;
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
