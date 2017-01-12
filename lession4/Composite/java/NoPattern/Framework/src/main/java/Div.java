import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/1/9.
 */
public class Div {
    public List<Object> children = new ArrayList<Object>();

    public void add(Button button) {
        children.add(button);
    }

    public void add(Textbox textbox) {
        children.add(textbox);
    }

    public void add(Br br) {
        children.add(br);
    }

    public void render(String prefix) {
        Global.out.println(prefix + "<div>");
        for (Object child : children) {
            if (child instanceof Button) {
                ((Button) child).render(prefix + "    ");
            } else if (child instanceof Textbox) {
                ((Textbox) child).render(prefix + "    ");
            } else if (child instanceof Br) {
                ((Br) child).render(prefix + "    ");
            }
        }
        Global.out.println(prefix + "</div>");
    }
}
