package AST.parser_pkg;

import AST.Python.Expression;

public class ConditionalExpression extends Expression {

    private Expression condition;
    private Expression thenExpr;
    private Expression elseExpr;

    public ConditionalExpression(Expression condition,
                                 Expression thenExpr,
                                 Expression elseExpr) {
        this.condition = condition;
        this.thenExpr = thenExpr;
        this.elseExpr = elseExpr;
    }

    public Expression getCondition() {
        return condition;
    }

    public Expression getThenExpr() {
        return thenExpr;
    }

    public Expression getElseExpr() {
        return elseExpr;
    }

    @Override
    public String toString() {
        return "(" + thenExpr + " if " + condition + " else " + elseExpr + ")";
    }
}
