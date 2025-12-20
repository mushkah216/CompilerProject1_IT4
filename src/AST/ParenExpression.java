package AST;

public class ParenExpression extends Expression{
    private Expression expression;

    public ParenExpression(Expression expression, int line,int column){
        super(line,column);
        this.expression = expression;
    }
    @Override
    public String toString(){
        return "("+ expression + ")";
    }
}
