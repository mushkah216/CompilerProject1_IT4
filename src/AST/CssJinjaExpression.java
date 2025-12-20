package AST;

public class CssJinjaExpression extends CssNode{
    private JinjaExpression expression;

    public CssJinjaExpression(JinjaExpression expression,int line, int column){
        super(line,column);
        this.expression = expression;
    }

    @Override
    public String toString(){
        return "{{" +  expression + "}}";
    }
}
