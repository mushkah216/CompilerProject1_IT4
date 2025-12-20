// Generated from C:/Users/DELL/IdeaProjects/untitled2/src/Web/WebParser.g4 by ANTLR 4.13.2
package Web;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link WebParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface WebParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link WebParser#htmlDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlDocument(WebParser.HtmlDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContent(WebParser.HtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElement(WebParser.HtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebParser#styleElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleElement(WebParser.StyleElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebParser#scriptElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptElement(WebParser.ScriptElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(WebParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebParser#attributeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeValue(WebParser.AttributeValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebParser#attributeValueContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeValueContent(WebParser.AttributeValueContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebParser#styleContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleContent(WebParser.StyleContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebParser#scriptContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptContent(WebParser.ScriptContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebParser#jinjaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaExpression(WebParser.JinjaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebParser#jinjaStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaStatement(WebParser.JinjaStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebParser#jinjaStatementBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaStatementBody(WebParser.JinjaStatementBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(WebParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebParser#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpression(WebParser.SimpleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(WebParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(WebParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(WebParser.PrimaryContext ctx);
}