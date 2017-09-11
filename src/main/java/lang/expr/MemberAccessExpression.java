package lang.expr;

/**
 * @author trollingchar
 */
public class MemberAccessExpression extends Expression {
    private final Expression expression;
    private final String member;

    public MemberAccessExpression(Expression expression, String member) {
        this.expression = expression;
        this.member = member;
    }

    @Override
    public String toString() {
        return String.format(". %s %s", expression.toString(), member);
    }
}
