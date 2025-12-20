package AST;

public abstract class Expression {
    public int line;
    public int column;
    public Expression(int line, int column){
        this.line = line;
        this.column = column;
    }
    @Override
    public abstract String toString();
}
