// Generated from C:/Users/DELL/IdeaProjects/untitled2/src/antler/Example1Parser.g4 by ANTLR 4.13.2
package antler;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Example1Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Example1ParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Example1Parser#page}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPage(Example1Parser.PageContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#page_style}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPage_style(Example1Parser.Page_styleContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(Example1Parser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#page_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPage_name(Example1Parser.Page_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#nav}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNav(Example1Parser.NavContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#footer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFooter(Example1Parser.FooterContext ctx);
}