package AST.parser_pkg;

public class MemberAccess extends Expression {

    private Expression object;
    private String memberName;

    public MemberAccess(Expression object, String memberName) {
        this.object = object;
        this.memberName = memberName;
    }

    public Expression getObject() {
        return object;
    }

    public String getMemberName() {
        return memberName;
    }

    @Override
    public String toString() {
        return object.toString() + "." + memberName;
    }
}
