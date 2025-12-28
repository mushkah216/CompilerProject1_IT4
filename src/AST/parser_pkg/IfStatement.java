package AST.parser_pkg;

import java.util.List;

public class IfStatement extends Statement {

    private Expression condition;
    private Block thenBlock;
    private List<ElifPart> elifParts;
    private ElsePart elsePart; // ممكن يكون null

    public IfStatement(Expression condition,
                       Block thenBlock,
                       List<ElifPart> elifParts,
                       ElsePart elsePart) {
        this.condition = condition;
        this.thenBlock = thenBlock;
        this.elifParts = elifParts;
        this.elsePart = elsePart;
    }

    public Expression getCondition() {
        return condition;
    }

    public Block getThenBlock() {
        return thenBlock;
    }

    public List<ElifPart> getElifParts() {
        return elifParts;
    }

    public ElsePart getElsePart() {
        return elsePart;
    }
}
