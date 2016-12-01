/**
 * Created by Administrator on 2016/12/1.
 */
public class Visitor1 implements Visitor {

    public void view(Element1 element1) {
        System.out.println("visitor1 view element1");
    }

    public void view(Element2 element2) {
        System.out.println("visitor1 view element2");
    }
}
