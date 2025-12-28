package AST.parser_pkg;

import java.util.List;

public class Target extends ASTNode {

    private String baseName;          // أول ID
    private List<TargetAccess> accesses; // .x أو [expr]

    public Target(String baseName, List<TargetAccess> accesses) {
        this.baseName = baseName;
        this.accesses = accesses;
    }

    public String getBaseName() {
        return baseName;
    }

    public List<TargetAccess> getAccesses() {
        return accesses;
    }
}
