package lang;

import lang.expr.Expression;

/**
 * @author trollingchar
 */
public class Statement {

    private Expression expression;

    public Statement(Expression expression){
        this.expression = expression;
    }

    @Override
    public String toString() {
        return expression.toString();
    }
}
