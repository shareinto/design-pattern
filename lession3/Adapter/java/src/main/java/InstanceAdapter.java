import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/12/27.
 */
public class InstanceAdapter<T> implements Queue<T> {

    private List<T> list;
    public InstanceAdapter() {
        this.list = new ArrayList<T>();
    }

    public void enqueue(T item) {
        list.add(item);
    }

    public T dequeue() {
        int size = list.size();
        if (size > 0) {
            T item = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return item;
        }
        return null;
    }

    public T peak() {
        int size = list.size();
        if (size > 0) {
            T item = list.get(list.size() - 1);
            return item;
        }
        return null;
    }
}
