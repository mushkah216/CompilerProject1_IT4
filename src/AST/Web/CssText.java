package AST.Web;

public class CssText extends CssNode{

    private String text;

    public CssText(String text, int line, int column){
        super(line,column);
        this.text = text;
    }
    @Override
    public String toString(){
        return text;
    }
}
