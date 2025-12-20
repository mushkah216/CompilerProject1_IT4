package AST;

public class JinjaElse extends JinjaStatement{

    public  JinjaElse(int line, int column){
        super(line,column);
    }
    @Override
    public String toString(){
        return "else ";
    }
}
