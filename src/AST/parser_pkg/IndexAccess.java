package AST.parser_pkg;
import AST.Expression;

public class IndexAccess extends TargetAccess {

    private Expression index;

    public IndexAccess(Expression index) {
        this.index = index;
    }

    public Expression getIndex() {
        return index;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "└── IndexAccess [Line: " + lineNumber + "]");
        if (index != null) {
            index.print(indent + "    ");
        }
    }

}

