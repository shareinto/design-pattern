/**
 * Created by Administrator on 2016/12/18.
 */
public class Toolbar {
    public Object getView(String id) {
        if (id.equals("smallCircle")) {
            return new Circle(1);
        } else if (id.equals("bigCircle")) {
            return new Circle(10);
        } else if (id.equals("smallRectangle")) {
            return new Rectangle(1, 1);
        } else if (id.equals("bigRectangle")) {
            return new Rectangle(10, 10);
        }
        throw new RuntimeException("view id is invalid");
    }
}
