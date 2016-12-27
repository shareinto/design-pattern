import java.util.*;

/**
 * Created by Administrator on 2016/12/27.
 */
public class Program {
    public static void main(String[] args) {
        Queue<Integer> queue = new InstanceAdapter<Integer>();
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
        }
        Integer item = null;
        while ((item = queue.dequeue()) != null) {
            System.out.println(String.format("dequeue get %d", item));
        }
    }
}
