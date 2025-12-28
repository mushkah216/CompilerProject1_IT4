package AST.parser_pkg;

import AST.Python.ASTNode;
import AST.Python.Expression;

public class Assignment extends ASTNode {

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
}
