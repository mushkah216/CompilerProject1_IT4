package AST.parser_pkg;

import AST.Statement;

import java.util.List;

public class ImportStatement extends Statement {

    // import x, y as z
    private boolean isFromImport;
    private String module;        // اسم الموديول (مثلاً flask)
    private List<String> names;   // الأسماء المستوردة
    private String alias;         // alias (اختياري)
    private boolean importAll;    // import *

    public ImportStatement(boolean isFromImport,
                           String module,
                           List<String> names,
                           String alias,
                           boolean importAll) {

        this.isFromImport = isFromImport;
        this.module = module;
        this.names = names;
        this.alias = alias;
        this.importAll = importAll;
    }

    public boolean isFromImport() {
        return isFromImport;
    }

    public String getModule() {
        return module;
    }

    public List<String> getNames() {
        return names;
    }

    public String getAlias() {
        return alias;
    }

    public boolean isImportAll() {
        return importAll;
    }

    @Override
    public void print(String indent) {
        String type = isFromImport ? "FromImport" : "Import";
        System.out.println(indent + "└── " + type + " [Line: " + lineNumber + "]");
        System.out.println(indent + "    ├── Module: " + module);
        if (names != null && !names.isEmpty()) {
            System.out.println(indent + "    ├── Names: " + names);
        }
        if (alias != null) {
            System.out.println(indent + "    └── Alias: " + alias);
        }
        if (importAll) {
            System.out.println(indent + "    └── ImportAll (*)");
        }
    }

}
