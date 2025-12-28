package AST.parser_pkg;

import AST.Expression;
import AST.Statement;

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

    @Override
    public void print(String indent) {
        System.out.println(indent + "└── IfStatement [Line: " + lineNumber + "]");
        if (condition != null) {
            System.out.print(indent + "    [Condition]: ");
            condition.print("");
        }
        if (thenBlock != null) {
            thenBlock.print(indent + "    [Then]");
        }
        if (elifParts != null) {
            for (ElifPart elif : elifParts) {
                elif.print(indent + "    ");
            }
        }
        if (elsePart != null) {
            elsePart.print(indent + "    ");
        }
    }

}
