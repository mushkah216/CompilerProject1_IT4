package AST;

import java.util.List;

public class Variable extends Expression{
    private List<String>names;

    public Variable(List<String> names, int line, int column){
        super(line,column);
        this.names = names;
    }
    @Override
    public String toString(){
        return String.join(". ", names);
    }
}
