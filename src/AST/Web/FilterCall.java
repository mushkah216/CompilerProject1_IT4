package AST.Web;

public class FilterCall extends Expression{

    private Expression base;
    private FilterName filter;

    public FilterCall(Expression base, FilterName filter ,int line, int column){
        super(line,column);
        this.base = base;
        this.filter = filter;
    }
    @Override
    public String toString(){
        return base + "|" + filter;
    }
}
