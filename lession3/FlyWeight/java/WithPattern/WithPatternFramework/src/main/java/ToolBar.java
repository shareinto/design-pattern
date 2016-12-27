import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/12/18.
 */
public class ToolBar {
    private Map<String, View> map = new HashMap<String, View>();

    public ToolBar registView(String id, View view) {
        map.put(id, view);
        return this;
    }

    public ToolBar removeView(String id) {
        map.remove(id);
        return this;
    }

    public View getView(String id) {
        View view = map.get(id);
        if (view == null) {
            throw new RuntimeException(String.format("view %s has not been regist", id));
        }
        return view.clone();
    }

    public void show(String id, FlyWeight flyWeight) {
        View view = map.get(id);
        if (view == null) {
            throw new RuntimeException(String.format("view %s has not been regist", id));
        }
        View clone = view.clone();
        flyWeight.draw(clone);
    }
}
