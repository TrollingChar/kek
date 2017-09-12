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
	 * Enter a parse tree produced by {@link KekParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_expression(KekParser.Primary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KekParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_expression(KekParser.Primary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KekParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list(KekParser.Expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link KekParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list(KekParser.Expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link KekParser#prefix_operator}.
	 * @param ctx the parse tree
	 */
	void enterPrefix_operator(KekParser.Prefix_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KekParser#prefix_operator}.
	 * @param ctx the parse tree
	 */
	void exitPrefix_operator(KekParser.Prefix_operatorContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link KekParser#shift_operator}.
	 * @param ctx the parse tree
	 */
	void enterShift_operator(KekParser.Shift_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KekParser#shift_operator}.
	 * @param ctx the parse tree
	 */
	void exitShift_operator(KekParser.Shift_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link KekParser#comparison_operator}.
	 * @param ctx the parse tree
	 */
	void enterComparison_operator(KekParser.Comparison_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KekParser#comparison_operator}.
	 * @param ctx the parse tree
	 */
	void exitComparison_operator(KekParser.Comparison_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link KekParser#equality_operator}.
	 * @param ctx the parse tree
	 */
	void enterEquality_operator(KekParser.Equality_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KekParser#equality_operator}.
	 * @param ctx the parse tree
	 */
	void exitEquality_operator(KekParser.Equality_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link KekParser#bitwise_operator}.
	 * @param ctx the parse tree
	 */
	void enterBitwise_operator(KekParser.Bitwise_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KekParser#bitwise_operator}.
	 * @param ctx the parse tree
	 */
	void exitBitwise_operator(KekParser.Bitwise_operatorContext ctx);
}