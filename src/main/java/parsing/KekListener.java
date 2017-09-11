// Generated from D:/fun/kek/src/main/grammar\Kek.g4 by ANTLR 4.7
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
	/**
	 * Enter a parse tree produced by {@link KekParser#multiplicative_operator}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicative_operator(KekParser.Multiplicative_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KekParser#multiplicative_operator}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicative_operator(KekParser.Multiplicative_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link KekParser#additive_operator}.
	 * @param ctx the parse tree
	 */
	void enterAdditive_operator(KekParser.Additive_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KekParser#additive_operator}.
	 * @param ctx the parse tree
	 */
	void exitAdditive_operator(KekParser.Additive_operatorContext ctx);
}