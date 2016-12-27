/**
 * Created by Administrator on 2016/12/18.
 */
public class Program {
    public static void main(String[] args) {
        Toolbar toolbar = new Toolbar();
        Circle circle = (Circle)toolbar.getView("smallCircle");
        circle.setRadius(2);
        ((Circle)toolbar.getView("smallCircle")).draw();
        //circle.draw();
    }
}
