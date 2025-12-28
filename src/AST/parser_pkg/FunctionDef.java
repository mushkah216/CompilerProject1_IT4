package AST.parser_pkg;

import java.util.ArrayList;
import java.util.List;

public class FunctionDef extends Statement {

    public String name;
    public ParameterList parameters;
    public Block body;
    public List<String> decorators;

    public FunctionDef(String name) {
        this.name = name;
        this.decorators = new ArrayList<>();
    }

    public void setParameters(ParameterList params) {
        this.parameters = params;
    }

    public void setBody(Block body) {
        this.body = body;
    }

    public void addDecorator(String decorator) {
        this.decorators.add(decorator);
    }

    @Override
    public String toString() {
        return "FunctionDef{" +
                "name='" + name + '\'' +
                ", decorators=" + decorators +
                ", params=" + parameters +
                ", body=\n" + body +
                '}';
    }
}
