/**
 * Created by Administrator on 2016/12/26.
 */
public class Transparent implements FlyWeight {
    private String transparent;

    public Transparent(String transparent) {
        this.transparent = transparent;
    }

    public void draw(View view) {
        System.out.print(String.format("%s, ", this.transparent));
        view.draw();
    }
}
