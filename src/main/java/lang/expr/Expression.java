package lang.expr;

import lang.Operator;

public abstract class Expression {

    // 1. a constant
    // 2. accessing a variable
    // 3. writing into a variable

    protected Expression() {
    }

    public static Expression constant(String literal) {
        return new ConstantExpression(literal);
    }

    public static Expression getter(String identifier) {
        return new GetVarExpression(identifier);
    }

    public static Expression setter(String identifier, Expression expression) {
        return new SetVarExpression(identifier, expression);
    }

    public static Expression operator(Operator operator, Expression ... operands) {
        return new OperatorExpression(operator, operands);
    }
}

