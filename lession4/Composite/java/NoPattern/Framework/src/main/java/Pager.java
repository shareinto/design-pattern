/**
 * Created by Administrator on 2017/1/9.
 */
public class Pager {
    private Header header;
    private Body body;

    public void add(Header header) {
        this.header = header;

    }

    public void add(Body body) {
        this.body = body;
    }

    public void render() {
        Global.out.println("<!DOCTYPE html>");
        Global.out.println("<html lang=\"zh-CN\">");
        header.render("    ");
        body.render("    ");
        Global.out.print("</html>");
    }
}
