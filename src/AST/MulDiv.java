package AST;

public class MulDiv extends Expression{

    private Expression left;
    private String operator;
    private Expression right;

    public MulDiv(Expression left, String operator, Expression right,int line, int column){
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
