import javax.sound.sampled.Line;

/**
 * Created by Administrator on 2017/1/9.
 */
public class LinkedList implements Iterator {

    private Object node;

    private LinkedList next;

    private LinkedList current;

    public LinkedList() {
        current = this;
    }

    public LinkedList setNext(Object node) {
        this.next = new LinkedList();
        this.next.node = node;
        return next;
    }

    @Override
    public String toString() {
        if (this.node == null) {
            return "head";
        }
        return this.node.toString();
    }


    public boolean hasNext() {
        return this.current.next != null;
    }

    public Object next() {
        Object next = this.current.next;
        this.current = current.next;
        return next;
    }
}
