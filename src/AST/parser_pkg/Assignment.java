package AST.parser_pkg;

import AST.ASTNode;
import AST.Expression;
import AST.Statement;

public class Assignment extends Statement {

    private Target target;
    private Expression value;

    public Assignment(Target target, Expression value) {
        this.target = target;
        this.value = value;
    }

    public Target getTarget() {
        return target;
    }

    public Expression getValue() {
        return value;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "└── Assignment [Line: " + lineNumber + "]");
        if (target != null) {
            ((ASTNode)target).print(indent + "    ");
        }
        if (value != null) {
            value.print(indent + "    ");
        }
    }

}
