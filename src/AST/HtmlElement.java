package AST;

import java.util.ArrayList;

public class HtmlElement extends HtmlNode {
    private String tagName;
    private ArrayList<HtmlAttribute> attributes;
    private ArrayList<HtmlNode>children;
    public HtmlElement(String tagName,int line , int column) {
        super(line,column);
        this.tagName = tagName;
        this.attributes = new ArrayList<>();
        this.children = new ArrayList<>();
    }
    public void addAttribute(HtmlAttribute attribute){
        attributes.add(attribute);
    }
    public void addChild(HtmlNode child){
        children.add(child);
    }

    @Override
    public String toString(){
        return "HtmlElement("+ tagName + ")" ;

    }
}
