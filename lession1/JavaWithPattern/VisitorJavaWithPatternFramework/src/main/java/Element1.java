/**
 * Created by Administrator on 2016/12/1.
 */
public class Element1 implements Element {
    public void accept(Visitor visitor) {
        visitor.view(this);
    }
}
