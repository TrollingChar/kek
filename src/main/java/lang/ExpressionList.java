package lang;

import lang.expr.Expression;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author trollingchar
 */
public class ExpressionList {

    public ArrayList<Expression> list;

    public ExpressionList() {
        list = new ArrayList<>();
    }

    public ExpressionList (Expression expression) {
        list = new ArrayList<>();
        add(expression);
    }

    public void add (Expression expression) {
        list.add(expression);
    }
}
