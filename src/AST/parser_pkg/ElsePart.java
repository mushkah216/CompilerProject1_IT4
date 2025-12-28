package AST.parser_pkg;

public class ElsePart extends ASTNode {

    private Block block;

    public ElsePart(Block block) {
        this.block = block;
    }

    public Block getBlock() {
        return block;
    }
}
