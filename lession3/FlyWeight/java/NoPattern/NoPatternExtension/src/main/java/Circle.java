/**
 * Created by Administrator on 2016/12/18.
 */
public class Circle {

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    private int radius;
    private Color color;

    public Circle(int radius, Color color) {
        this.radius = radius;
        this.color = color;
    }

    public void draw() {
        System.out.println(String.format("color is %s, draw circle: radius is %d", this.color.getColor(), this.radius));
    }
}
