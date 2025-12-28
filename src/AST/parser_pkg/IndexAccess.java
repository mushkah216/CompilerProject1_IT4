package AST.parser_pkg;

import AST.Python.ASTNode;



public class IndexAccess extends TargetAccess {

    private Expression index;

    public IndexAccess(Expression index) {
        this.index = index;
    }

    public Expression getIndex() {
        return index;
    }
}

