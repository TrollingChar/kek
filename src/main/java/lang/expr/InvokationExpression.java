package lang.expr;

import lang.ExpressionList;

/**
 * @author trollingchar
 */
public class InvokationExpression extends Expression {

    private final Expression expression;
    private final ExpressionList expressionList;

    public InvokationExpression(Expression expression, ExpressionList expressionList) {
        this.expression = expression;
        this.expressionList = expressionList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("(call " + expression);
        for (Expression expression : expressionList.list) sb.append(" " + expression);
        sb.append(")");
        return sb.toString();
    }
}
