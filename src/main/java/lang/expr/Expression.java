package lang.expr;

import lang.ExpressionList;
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

    public static Expression memberAccess(Expression expr, String member) {
        return new MemberAccessExpression(expr, member);
    }

    public static Expression setter(Expression primary, String property, Expression expression) {
        return null;
    }

    public static Expression invokation(Expression expression, ExpressionList expressionList) {
        return new InvokationExpression(expression, expressionList);
    }
}

