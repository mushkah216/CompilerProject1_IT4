package AST;

public  class LogicalOr extends Expression {

    private Expression left;
    private Expression right;

    public LogicalOr(Expression left, Expression right , int line, int column) {
        super(line, column);
        this.left = left;
        this.right = right;
    }
    @Override
    public  String toString(){
        return "(" + left+"or" +right+ ")";
    }
}
