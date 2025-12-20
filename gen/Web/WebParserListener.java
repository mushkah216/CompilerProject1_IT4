// Generated from C:/Users/DELL/IdeaProjects/untitled2/src/Web/WebParser.g4 by ANTLR 4.13.2
package Web;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link WebParser}.
 */
public interface WebParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link WebParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void enterHtmlDocument(WebParser.HtmlDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void exitHtmlDocument(WebParser.HtmlDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContent(WebParser.HtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContent(WebParser.HtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElement(WebParser.HtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElement(WebParser.HtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebParser#styleElement}.
	 * @param ctx the parse tree
	 */
	void enterStyleElement(WebParser.StyleElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebParser#styleElement}.
	 * @param ctx the parse tree
	 */
	void exitStyleElement(WebParser.StyleElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebParser#scriptElement}.
	 * @param ctx the parse tree
	 */
	void enterScriptElement(WebParser.ScriptElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebParser#scriptElement}.
	 * @param ctx the parse tree
	 */
	void exitScriptElement(WebParser.ScriptElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(WebParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(WebParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void enterAttributeValue(WebParser.AttributeValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void exitAttributeValue(WebParser.AttributeValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebParser#attributeValueContent}.
	 * @param ctx the parse tree
	 */
	void enterAttributeValueContent(WebParser.AttributeValueContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebParser#attributeValueContent}.
	 * @param ctx the parse tree
	 */
	void exitAttributeValueContent(WebParser.AttributeValueContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebParser#styleContent}.
	 * @param ctx the parse tree
	 */
	void enterStyleContent(WebParser.StyleContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebParser#styleContent}.
	 * @param ctx the parse tree
	 */
	void exitStyleContent(WebParser.StyleContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebParser#scriptContent}.
	 * @param ctx the parse tree
	 */
	void enterScriptContent(WebParser.ScriptContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebParser#scriptContent}.
	 * @param ctx the parse tree
	 */
	void exitScriptContent(WebParser.ScriptContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebParser#jinjaExpression}.
	 * @param ctx the parse tree
	 */
	void enterJinjaExpression(WebParser.JinjaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebParser#jinjaExpression}.
	 * @param ctx the parse tree
	 */
	void exitJinjaExpression(WebParser.JinjaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebParser#jinjaStatement}.
	 * @param ctx the parse tree
	 */
	void enterJinjaStatement(WebParser.JinjaStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebParser#jinjaStatement}.
	 * @param ctx the parse tree
	 */
	void exitJinjaStatement(WebParser.JinjaStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebParser#jinjaStatementBody}.
	 * @param ctx the parse tree
	 */
	void enterJinjaStatementBody(WebParser.JinjaStatementBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebParser#jinjaStatementBody}.
	 * @param ctx the parse tree
	 */
	void exitJinjaStatementBody(WebParser.JinjaStatementBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(WebParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(WebParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(WebParser.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(WebParser.SimpleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(WebParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(WebParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(WebParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(WebParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(WebParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(WebParser.PrimaryContext ctx);
}