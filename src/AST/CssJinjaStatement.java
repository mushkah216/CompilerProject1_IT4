package AST;

public class CssJinjaStatement extends CssNode{

    private JinjaStatement statement;
    public CssJinjaStatement (JinjaStatement statement , int line,int column){
        super(line,column);
        this.statement = statement;
    }

    @Override
    public String toString(){
        return "{%" +  statement + "%}";
    }
}
