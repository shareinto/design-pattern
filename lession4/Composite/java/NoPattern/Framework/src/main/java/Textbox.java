/**
 * Created by Administrator on 2017/1/9.
 */
public class Textbox {
    private String name;

    public Textbox(String name) {
        this.name = name;
    }

    public void render(String prefix) {
        Global.out.println(prefix + String.format("<input type=\"text\" name=\"%s\" />", this.name));
    }
}
