import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/12/26.
 */
public class ColorTransparentFlyWeightFactory extends FlyWeightFactory{
    private static Map<String, FlyWeight> maps = new HashMap<String, FlyWeight>();
    @Override
    public FlyWeight abstractFactory(String key) {
        String[] ss = key.split(",");
        if (!maps.containsKey(key)) {
            maps.put(key, new ColorTransparent(ss[0],ss[1]));
        }
        return maps.get(key);
    }
}
