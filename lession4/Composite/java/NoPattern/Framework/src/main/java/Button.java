/**
 * Created by Administrator on 2017/1/9.
 */
public class Button {
    private String name;

    public Button(String name) {
        this.name = name;
    }

    public void render(String prefix) {
        Global.out.println(prefix + String.format("<input type=\"button\" value=\"%s\" />",this.name ));
    }
}
