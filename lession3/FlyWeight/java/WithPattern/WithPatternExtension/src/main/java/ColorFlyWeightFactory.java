import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/12/26.
 */
public class ColorFlyWeightFactory extends FlyWeightFactory{
    private static Map<String, FlyWeight> maps = new HashMap<String, FlyWeight>();

    @Override
    public FlyWeight abstractFactory(String key) {
        if (!maps.containsKey(key)) {
            maps.put(key, new Color(key));
        }
        return maps.get(key);
    }
}
