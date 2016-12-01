/**
 * Created by Administrator on 2016/12/1.
 */
public class Element2 implements Element {
    public void accept(Visitor visitor) {
        visitor.view(this);
    }
}
