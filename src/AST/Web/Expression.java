package AST.Web;

public abstract class Expression extends HtmlNode {

    public Expression(int line, int column){
        super(line, column);
    }
    @Override
    public abstract String toString();
}
