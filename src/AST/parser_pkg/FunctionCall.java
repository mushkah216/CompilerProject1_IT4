package AST.parser_pkg;

import java.util.ArrayList;
import java.util.List;

public class FunctionCall extends Expression {

    private Expression callee;
    private List<Expression> arguments;

    public FunctionCall(Expression callee) {
        this.callee = callee;
        this.arguments = new ArrayList<>();
    }

    public FunctionCall(Expression callee, List<Expression> arguments) {
        this.callee = callee;
        this.arguments = arguments;
    }

    public void addArgument(Expression argument) {
        this.arguments.add(argument);
    }

    public Expression getCallee() {
        return callee;
    }

    public List<Expression> getArguments() {
        return arguments;
    }
}

