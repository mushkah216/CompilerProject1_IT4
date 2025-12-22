package AST;



public class JinjaSet extends JinjaStatement{
    private String name;
    private Expression expression;

    public JinjaSet(String name, Expression expression ,int line,int column){
        super(line,column);
        this.name = name;
        this.expression = expression;
    }
    @Override
    public String toString(){
        return "set" + name + "=" + expression;
    }
}
