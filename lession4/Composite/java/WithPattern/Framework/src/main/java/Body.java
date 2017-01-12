import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/1/9.
 */
public class Body extends Control {
    public void render(String prefix) {
        Global.out.println(prefix + "<body>");
        for (Control child : children) {
            child.render(prefix + "    ");
        }
        Global.out.println(prefix + "</body>");
    }
}
