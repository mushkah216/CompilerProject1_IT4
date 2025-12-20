// Generated from C:/Users/DELL/IdeaProjects/untitled2/src/Lexer.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LexerParser}.
 */
public interface LexerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LexerParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(LexerParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexerParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(LexerParser.StartContext ctx);
}