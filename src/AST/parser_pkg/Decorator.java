package AST.parser_pkg;

import java.util.List;

public class Decorator extends ASTNode {

    // مثال: @app.route → ["app", "route"]
    private List<String> nameParts;

    // arguments داخل الأقواس إن وجدت
    private List<Expression> arguments;

    public Decorator(List<String> nameParts, List<Expression> arguments) {
        this.nameParts = nameParts;
        this.arguments = arguments;
    }

    public List<String> getNameParts() {
        return nameParts;
    }

    public List<Expression> getArguments() {
        return arguments;
    }
}
