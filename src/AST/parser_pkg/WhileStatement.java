package AST.parser_pkg;

import AST.Expression;
import AST.Statement;

public class WhileStatement extends Statement {

    private Expression condition;
    private Block body;

    public WhileStatement(Expression condition, Block body) {
        this.condition = condition;
        this.body = body;
    }

    public Expression getCondition() {
        return condition;
    }

    public Block getBody() {
        return body;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "└── WhileStatement [Line: " + lineNumber + "]");
        if (condition != null) {
            System.out.print(indent + "    [Condition]: ");
            condition.print("");
        }
        if (body != null) {
            body.print(indent + "    [Body]");
        }
    }

}
