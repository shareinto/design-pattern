/**
 * Created by Administrator on 2017/1/9.
 */
public class Pager extends Control{
    public void render(String prefix) {
        Global.out.println("<!DOCTYPE html>");
        Global.out.println("<html lang=\"zh-CN\">");
        for (Control child : children) {
            child.render(prefix + "    ");
        }
        Global.out.print("</html>");
    }
}
