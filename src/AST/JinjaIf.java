package AST;

//import java.beans.Expression;

//import java.beans.Expression;

public class JinjaIf extends JinjaStatement {
    private Expression condition;

    public JinjaIf(Expression condition,int line,int column) {
        super(line,column);
        this.condition = condition;
    }
    @Override
    public String toString(){
        return "if "+condition ;
    }
}
