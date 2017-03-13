/**
 * Created by Administrator on 2017/3/13.
 */
public class VarExpression extends Expression {
    private String key;

    public String getKey() {
        return key;
    }

    public VarExpression(String key, int pos) {
        super(pos);
        this.key = key;
    }

    public int interpret(Context context) {
        return context.visit(this);
    }
}
