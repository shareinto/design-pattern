import java.lang.reflect.InvocationHandler;

/**
 * Created by Administrator on 2016/12/18.
 */
public class Program {
    public static void main(String[] args) {
        Toolbar toolbar = new Toolbar();
        Circle circle = (Circle)toolbar.getView("smallCircle","red");
        circle.draw();
    }
}
