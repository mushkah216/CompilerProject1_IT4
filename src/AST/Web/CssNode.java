package AST.Web;

public abstract class CssNode {
    public int line;
    public int column;

    public CssNode(int line, int column) {
        this.line = line;
        this.column = column;
    }
    @Override
    public abstract String toString() ;
}
