/**
 * Created by Administrator on 2017/1/9.
 */
public class Label extends Control {

    private String name;

    public Label(String name) {
        this.name = name;
    }

    @Override
    public void render(String prefix) {
        Global.out.print(String.format("<label>%s</label>", this.name));
    }
}
