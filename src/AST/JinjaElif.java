package AST;



public class JinjaElif extends JinjaStatement{

    private Expression condition;

    public JinjaElif(Expression condition,int line, int column){
        super(line,column);
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "elif "+condition;
    }
}
