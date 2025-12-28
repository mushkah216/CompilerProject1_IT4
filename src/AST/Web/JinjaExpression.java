package AST.Web;



public class JinjaExpression extends JinjaNode{
    private Expression expression;

    public JinjaExpression(Expression expression,int line,int column){
        super(line,column);
        this.expression = expression;
    }
    @Override
    public String toString(){
        return expression.toString();
    }

}
