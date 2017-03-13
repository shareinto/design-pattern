import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/3/13.
 */
public abstract class Context {

    private Map<String,Integer> maps = new HashMap<String, Integer>();

    public Map<String, Integer> getMaps() {
        return maps;
    }

    public abstract int visit(VarExpression expression);
    public abstract int visit(SubExpression expression);
    public abstract int visit(AddExpression expression);
}
