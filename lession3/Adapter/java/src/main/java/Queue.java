/**
 * Created by Administrator on 2016/12/27.
 */
public interface Queue<T> {
    void enqueue(T item);
    T dequeue();
    T peak();
}
