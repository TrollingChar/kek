package lang;

public enum Operator {
    EXPONENT("**"),
    MULTIPLY("*"),
    DIVIDE("/"),
    REMNANT("%"),
    ADD("+"),
    SUBTRACT("-"),
    LEFT_SHIFT("<<"),
    RIGHT_SHIFT(">>"),
    LESS("<"),
    GREATER(">"),
    LESS_EQUAL("<="),
    GREATER_EQUAL(">="),
    EQUAL("=="),
    NOT_EQUAL("!="),
    BIT_AND(""),
    BIT_OR(""),
    BIT_XOR(""),
    BIT_CLEAR(""),
    AND("&&"),
    OR("||"),

    UNARY_PLUS("+"),
    UNARY_MINUS("-"),
    NOT("!"),
    BIT_NOT("!"),
    PRE_INC("++@"),
    PRE_DEC("--@");

    private String string;

    Operator(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return string;
    }
}
