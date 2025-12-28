package Visitor;

import AST.ASTNode;
import AST.Statement;
import AST.parser_pkg.*;
import org.antlr.v4.runtime.tree.ParseTree;
import parser_pkg.pythonParser;
import AST.Expression;
import parser_pkg.pythonParserBaseVisitor;

import java.util.List;
import java.util.ArrayList;


public class PythonVisitor extends pythonParserBaseVisitor<ASTNode> {

}
