import java.util.*;

/**
 * Created by Administrator on 2016/12/27.
 */
public class ClassAdapter<T> extends ArrayList<T> implements Queue<T> {

    public void enqueue(T item) {
        this.add(item);
    }
    public T dequeue() {
        int size = this.size();
        if (size > 0) {
            T item = this.get(this.size() - 1);
            this.remove(this.size() - 1);
            return item;
        }
        return null;
    }

    public T peak() {
        int size = this.size();
        if (size > 0) {
            T item = this.get(this.size() - 1);
            return item;
        }
        return null;
    }
}
