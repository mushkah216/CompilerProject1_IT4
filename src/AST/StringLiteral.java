package AST;

public class StringLiteral extends Expression{

    private String value;
    public StringLiteral(String value , int line, int column){
        super(line,column);
        this.value = value;
    }
    @Override
    public String toString(){
        return value;
    }
}
