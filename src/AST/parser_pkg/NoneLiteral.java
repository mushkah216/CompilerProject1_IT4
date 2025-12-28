package AST.parser_pkg;

public class NoneLiteral extends Literal {

    @Override
    public String toString() {
        return "NoneLiteral";
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "└── NoneLiteral [Line: " + lineNumber + "]");
    }

}
