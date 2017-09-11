package lang;

public enum Operator {
    ADD("+"),
    SUBTRACT("-"),
    MULTIPLY("*"),
    DIVIDE("/"),
    EXPONENT("**"),

    UNARY_MINUS("-@");

    private String string;

    Operator(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return string;
    }
}
