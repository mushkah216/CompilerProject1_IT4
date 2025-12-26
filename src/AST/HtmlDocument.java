package AST;

import java.util.ArrayList;

public class HtmlDocument extends HtmlNode {

    private ArrayList<HtmlNode> children;

    public HtmlDocument(int line, int column) {
        super(line, column);
        this.children = new ArrayList<>();
    }
    public  void addChild(HtmlNode node) {
        children.add(node);
    }

    @Override
    public String toString() {
        return "HtmlDocument " + children.toString();
    }

}
