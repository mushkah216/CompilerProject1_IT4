package AST;

import java.util.ArrayList;

public class StyleElement extends CssNode{

    private ArrayList<CssNode> children=new ArrayList<>();

    public StyleElement(int line, int column) {
        super(line, column);
    }
    public void addChild(CssNode node){
        children.add(node);
    }
    @Override
    public String toString(){
        return "<style>" + children + "</style>";
    }
}
