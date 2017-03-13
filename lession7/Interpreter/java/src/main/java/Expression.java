/**
 * Created by Administrator on 2017/3/13.
 */
public abstract class Expression {
    private int pos;

    public int getPos() {
        return pos;
    }

    public Expression(int pos) {
        this.pos = pos;
    }

    public abstract int interpret(Context context);
}
