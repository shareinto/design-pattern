import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/12/1.
 */
public class ObjectStructure {
    private List<Element> list = new ArrayList<Element>();

    public void add(Element element) {
        list.add(element);
    }

    public void accept(Visitor visitor) {
        for (Element element : list) {
            element.accept(visitor);
        }
    }
}
