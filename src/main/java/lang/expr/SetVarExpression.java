package lang.expr;

/**
 * @author trollingchar
 */
public class SetVarExpression extends Expression {

    public String identifier;
    public Expression expression;

    public SetVarExpression(String identifier, Expression expression) {
        this.identifier = identifier;
        this.expression = expression;
    }

    @Override
    public String toString() {
        return String.format("(set %s %s)", identifier, expression);
    }
}
