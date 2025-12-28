package AST.parser_pkg;

import AST.ASTNode;

import java.util.ArrayList;
import java.util.List;

public class ParameterList extends ASTNode {

    public List<Parameter> parameters;

    public ParameterList() {
        this.parameters = new ArrayList<>();
    }

    public void addParameter(Parameter p) {
        parameters.add(p);
    }

    public List<Parameter> getParameters() {
        return parameters;
    }

    @Override
    public String toString() {
        return parameters.toString();
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "└── ParameterList [Line: " + lineNumber + "]");
        for (Parameter p : parameters) {
            if (p != null) {
                p.print(indent + "    ");
            }
        }
    }

}
