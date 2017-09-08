// Generated from C:/Users/Dima/IdeaProjects/kek/src/main/grammar\Kek.g4 by ANTLR 4.7
package parsing;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link KekParser}.
 */
public interface KekListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link KekParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(KekParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link KekParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(KekParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link KekParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(KekParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KekParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(KekParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KekParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(KekParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KekParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(KekParser.ExpressionContext ctx);
}