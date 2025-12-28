package AST.parser_pkg;

import AST.ASTNode;

public class ElsePart extends ASTNode {

    private Block block;

    public ElsePart(Block block) {
        this.block = block;
    }

    public Block getBlock() {
        return block;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "└── ElsePart (Line: " + lineNumber + ")");
        block.print(indent + "    ");
    }
}
