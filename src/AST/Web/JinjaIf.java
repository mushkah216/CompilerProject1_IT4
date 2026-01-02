package AST.Web;

public class JinjaIf extends JinjaStatement {
    private AST.Web.Expression condition;

    public JinjaIf(Expression condition, int line, int column) {
        super(line,column);
        this.condition = condition;
    }
    @Override
    public String toString(){
        return "if "+condition ;
    }
}
