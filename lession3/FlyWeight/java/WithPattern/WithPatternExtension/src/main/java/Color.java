import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/12/26.
 */
public class Color implements FlyWeight {

    private String color;

    public Color(String color) {
        this.color = color;
    }

    public String color() {
        return this.color;
    }

    public void draw(View view) {
        System.out.print(String.format("color is %s,", this.color));
        view.draw();
    }
}
