/**
 * Created by Administrator on 2016/12/18.
 */
public class Rectangle {
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    private int x;
    private int y;

    public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw() {
        System.out.println(String.format("draw rectangle: x is %d,y is %d", this.x, this.y));
    }
}
