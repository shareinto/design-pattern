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

    public Circle(int radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println(String.format("draw circle: radius is %d", this.radius));
    }
}
