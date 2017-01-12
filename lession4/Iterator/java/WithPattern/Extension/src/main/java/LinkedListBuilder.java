/**
 * Created by Administrator on 2017/1/9.
 */
public class LinkedListBuilder {
    private LinkedList head = new LinkedList();
    private LinkedList current = head;

    public LinkedListBuilder append(Object node) {
        current = current.setNext(node);
        return this;
    }

    public LinkedList build() {
        return head;
    }
}
