package AST;

public class JinjaEndFor extends JinjaStatement{

    public JinjaEndFor(int line ,int column){
        super(line,column);
    }
    @Override
    public String toString(){
        return "endfor ";
    }
}
