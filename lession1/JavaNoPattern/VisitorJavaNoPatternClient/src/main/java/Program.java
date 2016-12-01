import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/12/1.
 */
public class Program {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<Object>();
        list.add(new Element1());
        list.add(new Element2());

        Visitor1 visitor1 = new Visitor1();
        Visitor2 visitor2 = new Visitor2();
        Visitor3 visitor3 = new Visitor3();

        for (Object element : list) {
            ObjectStructure.dispatch(element, visitor1);
        }
        for (Object element : list) {
            ObjectStructure.dispatch(element, visitor2);
        }
        for (Object element : list) {
            ObjectStructure.dispatch(element, visitor3);
        }
    }
}
