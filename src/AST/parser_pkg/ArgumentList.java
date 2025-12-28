package AST.parser_pkg;

import AST.ASTNode;

import java.util.ArrayList;
import java.util.List;

public class ArgumentList extends ASTNode {
    private final List<Argument> arguments;

    public ArgumentList() {
        this.arguments = new ArrayList<>();
    }

    public void addArgument(Argument argument) {
        this.arguments.add(argument);
    }

    public List<Argument> getArguments() {
        return arguments;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "└── ArgumentList [Line: " + lineNumber + "]");
        for (Argument arg : arguments) {
            arg.print(indent + "    ");
        }
    }
}

