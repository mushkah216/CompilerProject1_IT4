package AST;

public abstract class JinjaStatement extends JinjaNode{
    public JinjaStatement(int line,int column) {
        super(line,column);
    }
}
