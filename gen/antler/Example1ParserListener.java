// Generated from C:/Users/DELL/IdeaProjects/untitled2/src/antler/Example1Parser.g4 by ANTLR 4.13.2
package antler;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Example1Parser}.
 */
public interface Example1ParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Example1Parser#page}.
	 * @param ctx the parse tree
	 */
	void enterPage(Example1Parser.PageContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#page}.
	 * @param ctx the parse tree
	 */
	void exitPage(Example1Parser.PageContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#page_style}.
	 * @param ctx the parse tree
	 */
	void enterPage_style(Example1Parser.Page_styleContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#page_style}.
	 * @param ctx the parse tree
	 */
	void exitPage_style(Example1Parser.Page_styleContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(Example1Parser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(Example1Parser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#page_name}.
	 * @param ctx the parse tree
	 */
	void enterPage_name(Example1Parser.Page_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#page_name}.
	 * @param ctx the parse tree
	 */
	void exitPage_name(Example1Parser.Page_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#nav}.
	 * @param ctx the parse tree
	 */
	void enterNav(Example1Parser.NavContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#nav}.
	 * @param ctx the parse tree
	 */
	void exitNav(Example1Parser.NavContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#footer}.
	 * @param ctx the parse tree
	 */
	void enterFooter(Example1Parser.FooterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#footer}.
	 * @param ctx the parse tree
	 */
	void exitFooter(Example1Parser.FooterContext ctx);
}