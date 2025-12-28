package AST.parser_pkg;

import AST.ASTNode;
import AST.Expression;

public class ElifPart extends ASTNode {

    private Expression condition;
    private Block block;

    public ElifPart(Expression condition, Block block) {
        this.condition = condition;
        this.block = block;
    }

    public Expression getCondition() {
        return condition;
    }

    public Block getBlock() {
        return block;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "└── ElifPart (Line: " + lineNumber + ")");
        condition.print(indent + "    ");
        block.print(indent + "    ");
    }
}
