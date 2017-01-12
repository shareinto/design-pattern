/**
 * Created by Administrator on 2017/1/9.
 */
public class Header extends Control {
    public void render(String prefix) {
        Global.out.println(prefix + String.format("<header>" ));
        Global.out.println(prefix + String.format("</header>" ));
    }
}
