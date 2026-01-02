package AST.Web;


public class AttributeJinjaStatement extends AttributeValuePart {

    private JinjaStatement statement;

    public AttributeJinjaStatement(JinjaStatement statement,int line, int colum){
        super(line,colum);
        this.statement = statement;
    }
    @Override
    public String toString(){
        return "{%" + statement + "%}";
    }
}
