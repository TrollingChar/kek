package lang.expr;

import lang.Operator;

import java.util.Collection;

/**
 * @author trollingchar
 */
public class OperatorExpression extends Expression {

    Expression[] operands;
    Operator operator;

    public OperatorExpression (Operator operator, Expression ... operands) {
        this.operator = operator;
        this.operands = operands;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("(" + operator.toString());
        for (Expression operand : operands) sb.append(" " + operand.toString());
        sb.append(")");
        return sb.toString();
    }
}
