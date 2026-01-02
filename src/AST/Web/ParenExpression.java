package AST.Web;

public class ParenExpression extends AST.Web.Expression {
    private AST.Web.Expression expression;

    public ParenExpression(Expression expression, int line, int column){
        super(line,column);
        this.expression = expression;
    }
    @Override
    public String toString(){
        return "("+ expression + ")";
    }
}
