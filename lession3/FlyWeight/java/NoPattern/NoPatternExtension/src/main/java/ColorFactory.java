import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/12/26.
 */
public class ColorFactory {
    private static Map<String, Color> maps = new HashMap<String, Color>();

    public static Color getColor(String key) {
        if (!maps.containsKey(key)) {
            maps.put(key, new Color(key));
        }
        return maps.get(key);
    }
}
