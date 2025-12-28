package AST.Web;

public class JinjaEndIf extends JinjaStatement{

    public JinjaEndIf(int line, int column){
        super(line,column);
    }
    @Override
    public String toString(){
        return "endif ";
    }
}
