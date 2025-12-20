package AST;

public abstract class JinjaNode {
    public int line;
    public int column;
    public JinjaNode(int line, int column) {
        this.line = line;
        this.column = column;
    }
    @Override
    public abstract String toString();
}
