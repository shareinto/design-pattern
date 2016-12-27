/**
 * Created by Administrator on 2016/12/26.
 */
public class ColorTransparent implements FlyWeight {

    private String color;
    private String transparent;

    public ColorTransparent(String color, String transparent) {
        this.color = color;
        this.transparent = transparent;
    }

    public void draw(View view) {
        System.out.print(String.format("%s, color is %s,", this.transparent, this.color));
        view.draw();
    }
}
