/**
 * Created by Administrator on 2016/12/18.
 */
public class Toolbar {
    public Object getView(String id, String key) {
        if (id.equals("smallCircle")) {
            return new Circle(1, ColorFactory.getColor(key));
        } else if (id.equals("bigCircle")) {
            return new Circle(10, ColorFactory.getColor(key));
        } else if (id.equals("smallRectangle")) {
            return new Rectangle(1, 1, ColorFactory.getColor(key));
        } else if (id.equals("bigRectangle")) {
            return new Rectangle(10, 10, ColorFactory.getColor(key));
        }
        throw new RuntimeException("view id is invalid");
    }
}
