package lang.expr;

public class ConstantExpression extends Expression {

    public String literal;

    public ConstantExpression(String literal) {
        this.literal = literal;
    }

    @Override
    public String toString() {
        return literal;
    }
}
