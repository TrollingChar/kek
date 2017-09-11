package lang.expr;

/**
 * @author trollingchar
 */
public class GetVarExpression extends Expression {

    public String identifier;

    public GetVarExpression(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return String.format("(get %s)", identifier);
    }
}
