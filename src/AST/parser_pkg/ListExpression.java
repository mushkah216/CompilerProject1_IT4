package AST.parser_pkg;

import AST.Expression;
import java.util.List;

public class ListExpression extends Expression {

    // العناصر داخل الليست (expressions عادية)
    private final List<Expression> elements;

    // optional: comprehension parts
    private final String loopVariable;        // p
    private final Expression iterable;         // products
    private final Expression condition;        // p['id'] == id (optional)

    // constructor لليست عادية
    public ListExpression(List<Expression> elements) {
        this.elements = elements;
        this.loopVariable = null;
        this.iterable = null;
        this.condition = null;
    }

    // constructor لليست comprehension
    public ListExpression(
            Expression element,
            String loopVariable,
            Expression iterable,
            Expression condition
    ) {
        this.elements = List.of(element);
        this.loopVariable = loopVariable;
        this.iterable = iterable;
        this.condition = condition;
    }

    public List<Expression> getElements() {
        return elements;
    }

    public String getLoopVariable() {
        return loopVariable;
    }

    public Expression getIterable() {
        return iterable;
    }

    public Expression getCondition() {
        return condition;
    }

    @Override
    public void print(String indent) {
        if (loopVariable == null) {
            System.out.println(indent + "└── ListExpression (Elements: " + elements.size() + ") [Line: " + lineNumber + "]");
            for (Expression expr : elements) {
                expr.print(indent + "    ");
            }
        } else {
            System.out.println(indent + "└── ListComprehension [Line: " + lineNumber + "]");
            if (!elements.isEmpty()) elements.get(0).print(indent + "    [Element]: ");
            System.out.println(indent + "    ├── For: " + loopVariable);
            if (iterable != null) iterable.print(indent + "    ├── In: ");
            if (condition != null) condition.print(indent + "    └── If: ");
        }
    }

}
