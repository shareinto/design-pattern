/**
 * Created by Administrator on 2017/3/13.
 */
public class CaculateContext extends Context {
    @Override
    public int visit(VarExpression expression) {
        return this.getMaps().get(expression.getKey());
    }

    @Override
    public int visit(SubExpression expression) {
        return expression.getLeft().interpret(this) - expression.getRight().interpret(this);
    }

    @Override
    public int visit(AddExpression expression) {
        return expression.getLeft().interpret(this) + expression.getRight().interpret(this);
    }
}
