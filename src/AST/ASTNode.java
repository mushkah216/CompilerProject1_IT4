package AST;

public abstract class ASTNode {
    protected int lineNumber;

    public void setLineNumber(int line) { this.lineNumber = line; }
    public int getLineNumber() { return lineNumber; }

    public abstract void print(String indent);
}
