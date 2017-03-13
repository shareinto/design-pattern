/**
 * Created by Administrator on 2017/3/13.
 */
public class ValidateContext extends Context {
    @Override
    public int visit(VarExpression expression) {
        return 0;
    }

    @Override
    public int visit(SubExpression expression) {
        if (expression.getLeft() == null) {
            throw new RuntimeException("加法操作需要左操作数，位置 " + expression.getPos());
        }
        if (expression.getRight() == null) {
            throw new RuntimeException("加法操作需要左操作数，位置 " + expression.getPos());
        }
        expression.getLeft().interpret(this);
        expression.getRight().interpret(this);
        return 0;
    }

    @Override
    public int visit(AddExpression expression) {
        if (expression.getLeft() == null) {
            throw new RuntimeException("减法操作需要左操作数，位置 " + expression.getPos());
        }
        if (expression.getRight() == null) {
            throw new RuntimeException("减法操作需要左操作数，位置 " + expression.getPos());
        }
        expression.getLeft().interpret(this);
        expression.getRight().interpret(this);
        return 0;
    }
}
