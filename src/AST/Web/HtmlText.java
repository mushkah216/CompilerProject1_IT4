package AST.Web;

public class HtmlText extends HtmlNode {
    private String text;

    public HtmlText(String text , int line, int column){
        super(line,column);
        this.text = text;

    }

    @Override
    public String toString() {
        return "HtmlTextNode (\"" + text.trim() + "\") (Line: " + line + ")";
    }
}
