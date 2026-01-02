package SymbolTable;

import java.util.HashMap;
import java.util.Map;

public class WebSymbolTable {
    private Map<String, Object> symbols = new HashMap<>();
    private WebSymbolTable parent;


    public WebSymbolTable() { this.parent = null; }


    public WebSymbolTable(WebSymbolTable parent) { this.parent = parent; }

    public void define(String name, Object value) {
        System.out.println("Symbol Table Update: Defined '" + name + "' = " + value);
        symbols.put(name, value);
    }

    public Object lookup(String name) {
        if (symbols.containsKey(name)) {
            System.out.println("Symbol Lookup: Found '" + name + "' (Variable)");
            return symbols.get(name);
        }
        if (parent != null) return parent.lookup(name);

        System.out.println("Symbol Lookup: '" + name + "' NOT FOUND");
        return null;
    }

    public WebSymbolTable getParent() { return parent; }
    public void print() {
        System.out.println("--- Current Scope Symbols ---");
        symbols.forEach((key, value) -> System.out.println(key + " = " + value));
        if (parent != null) {
            System.out.println("Parent scope exists.");
        }
        System.out.println("-----------------------------");
    }
}