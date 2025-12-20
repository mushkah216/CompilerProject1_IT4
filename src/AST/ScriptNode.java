package AST;

public abstract class ScriptNode {
    public int line;
    public int column;

    public ScriptNode(int line, int column){
        this.line = line;
        this.column = column;
    }
    public int getLine(){return line;}
    public int getColumn(){return column;}

    @Override
    public abstract String toString();

}
