/**
 * Created by Administrator on 2016/12/18.
 */
public class Circle implements View {

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    private int radius;

    public void draw() {
        System.out.println(String.format("draw circle: radius is %d", this.radius));
    }

    public View clone() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (View) obj;
    }
}
