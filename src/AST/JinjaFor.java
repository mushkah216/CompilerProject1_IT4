package AST;

//import java.beans.Expression;

public class JinjaFor extends JinjaStatement
{
    private String variable;
    private Expression iterable;

    public JinjaFor(String variable, Expression iterable,int line,int column)
    {
        super(line,column);
        this.variable = variable;
        this.iterable = iterable;
    }
    @Override
    public String toString()
    {
        return "for" + variable+ "in "+iterable;
    }
}
