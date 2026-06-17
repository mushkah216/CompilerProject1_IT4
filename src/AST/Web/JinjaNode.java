package AST.Web;

public abstract class JinjaNode extends HtmlNode {
    public int line;
    public int column;
    public JinjaNode(int line, int column) {
        super(line, column);
    }

}
