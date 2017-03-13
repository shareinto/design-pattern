/**
 * Created by Administrator on 2017/3/13.
 */
public class AddExpression extends SymbolExpression {
    public AddExpression(Expression left, Expression right, int pos) {
        super(left, right, pos);
    }

    public int interpret(Context context) {
        return context.visit(this);
    }
}
