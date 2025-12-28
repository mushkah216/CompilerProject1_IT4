package AST.Web;

public class AttributeText extends AttributeValuePart {
    private String text;

    public AttributeText(int line, int column, String text) {
        super(line, column);
        this.text = text;

    }
    @Override
    public String toString(){
        return text;
    }
}
