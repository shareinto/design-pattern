import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/1/9.
 */
public abstract class Control {
    public abstract void render(String prefix);

    protected List<Control> children = new ArrayList();

    public void add(Control control) {
        children.add(control);
    }
}
