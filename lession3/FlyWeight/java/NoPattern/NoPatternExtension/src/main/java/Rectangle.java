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
    private Color color;

    public Rectangle(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public void draw() {
        System.out.println(String.format("color is %s, draw rectangle: x is %d,y is %d",this.color.getColor(), this.x, this.y));
    }
}
