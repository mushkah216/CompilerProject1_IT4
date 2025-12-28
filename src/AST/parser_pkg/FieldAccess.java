package AST.parser_pkg;

import AST.Python.ASTNode;

public class FieldAccess extends ASTNode {

    private String fieldName;

    public FieldAccess(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldName() {
        return fieldName;
    }
}
