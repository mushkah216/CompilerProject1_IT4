// Generated from C:/Users/DELL/IdeaProjects/untitled2/src/Lexer.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LexerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LexerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LexerParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(LexerParser.StartContext ctx);
}