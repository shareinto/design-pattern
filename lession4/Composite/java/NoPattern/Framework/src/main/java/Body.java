import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/1/9.
 */
public class Body {
    private List<Div> children = new ArrayList<Div>();

    public void add(Div div) {
        children.add(div);
    }

    public void render(String prefix) {
        Global.out.println(prefix + "<body>");
        for (Div child : children) {
            child.render(prefix + "    ");
        }
        Global.out.println(prefix + "</body>");
    }
}
