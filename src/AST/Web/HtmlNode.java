package AST.Web;

public abstract class HtmlNode {
    protected int line;
    protected int column;

    public HtmlNode(int line, int column) {
        this.line = line;
        this.column = column;
    }
    public int getLine() {return line;}
    public int getColumn() {return column;}

    @Override
    public abstract String toString() ;
}
