package AST;

public class ScriptJinjaExpression extends ScriptNode
{
    private JinjaExpression expression;

    public  ScriptJinjaExpression(JinjaExpression expression,int line,int column) {
        super(line,column);
        this.expression = expression;
    }

    public JinjaExpression getExpression() {
        return expression;
    }
    @Override
    public String  toString()
    {
        return "{{" + expression + "}}";
    }
}
