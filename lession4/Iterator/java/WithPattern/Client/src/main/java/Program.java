/**
 * Created by Administrator on 2017/1/9.
 */
public class Program {
    public static void main(String[] args) {
        Object[] array = {5, 7, 2, 1, 8, 0, 6, 3, 4, 9};
        Iterator iterator = new Array(array);
        Displayer.show(iterator);
        Displayer.show(iterator);
        System.out.println();
        iterator = initLinkedList();
        Displayer.show(iterator);
    }

    private static LinkedList initLinkedList() {
        LinkedListBuilder builder = new LinkedListBuilder();
         builder.append(5)
                .append(7)
                .append(2)
                .append(1)
                .append(8)
                .append(0)
                .append(6)
                .append(3)
                .append(4)
                .append(9);
        return builder.build();
    }
}
