package AST.parser_pkg;

public class MemberTarAccess extends TargetAccess {

    private String name;

    public MemberTarAccess(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "└── MemberTargetAccess: " + name + " [Line: " + lineNumber + "]");
    }

}
