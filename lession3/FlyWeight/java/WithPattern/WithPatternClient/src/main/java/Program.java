/**
 * Created by Administrator on 2016/12/18.
 */
public class Program {
    public static void main(String[] args) {
        ToolBar toolBar = new ToolBar();
        toolBar.registView("smallCircle", new Circle(2))
                .registView("bigCircle", new Circle(10))
                .registView("smallRectangle", new Rectangle(1, 1))
                .registView("bigRectangle", new Rectangle(10, 10));

        FlyWeightFactory factory = new ColorFlyWeightFactory();
        factory.show(toolBar.getView("smallCircle"), "red");

        factory = new TransparentFlyWeightFactory();
        factory.show(toolBar.getView("bigRectangle"), "transparent");

        factory = new ColorTransparentFlyWeightFactory();
        factory.show(toolBar.getView("bigCircle"), "green,untransparent");
    }
}
