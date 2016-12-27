/**
 * Created by Administrator on 2016/12/26.
 */
public abstract class FlyWeightFactory {
    public void show(View view, String key) {
        abstractFactory(key).draw(view);
    }

    public abstract FlyWeight abstractFactory(String key);
}
