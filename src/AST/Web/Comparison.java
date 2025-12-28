package AST.Web;

public class Comparison extends Expression {

    private  Expression left;
    private String operator;
    private Expression right;
    public Comparison(Expression left,String operator, Expression right ,int line, int column)
    {
        super(line,column);
        this.left=left;
        this.operator=operator;
        this.right=right;
    }
    @Override
    public String toString(){
        return "("+left+" "+operator+" "+right+")";
    }
}
