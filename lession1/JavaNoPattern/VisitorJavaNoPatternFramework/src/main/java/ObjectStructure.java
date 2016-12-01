/**
 * Created by Administrator on 2016/12/1.
 */
public class ObjectStructure {
    public static void dispatch(Object element, Object visitor) {
        if (element instanceof Element1 && visitor instanceof Visitor1) {
            ((Visitor1) visitor).view((Element1) element);
        }
        if (element instanceof Element2 && visitor instanceof Visitor1) {
            ((Visitor1) visitor).view((Element2) element);
        }
        if (element instanceof Element1 && visitor instanceof Visitor2) {
            ((Visitor2) visitor).view((Element1) element);
        }
        if (element instanceof Element2 && visitor instanceof Visitor2) {
            ((Visitor2) visitor).view((Element2) element);
        }

        if (element instanceof Element1 && visitor instanceof Visitor3) {
            ((Visitor3) visitor).view((Element1) element);
        }
        if (element instanceof Element2 && visitor instanceof Visitor3) {
            ((Visitor3) visitor).view((Element2) element);
        }
    }
}
