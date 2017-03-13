import java.util.Stack;

/**
 * Created by Administrator on 2017/3/13.
 */
public class Parser {
    public Expression parse(String expression) {
        Stack<Expression> stack = new Stack<Expression>();
        Expression left = null;
        Expression right = null;
        for (int i = 0; i < expression.length(); i++) {
            switch (expression.charAt(i)) {
                case '+':
                    if (stack.size() > 0) {
                        left = stack.pop();
                    }
                    right = new VarExpression(new String(new char[]{expression.charAt(++i)}),i);
                    stack.push(new AddExpression(left, right, i - 1));
                    break;
                case '-':
                    if (stack.size() > 0) {
                        left = stack.pop();
                    }
                    right = new VarExpression(new String(new char[]{expression.charAt(++i)}), i);
                    stack.push(new SubExpression(left, right, i - 1));
                    break;
                default:
                    stack.push(new VarExpression(new String(new char[]{expression.charAt(i)}), i));
                    break;
            }
        }
        if (stack.size() > 0) {
            return stack.pop();
        }
        return null;
    }
}
