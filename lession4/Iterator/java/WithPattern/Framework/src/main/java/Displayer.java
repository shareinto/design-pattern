/**
 * Created by Administrator on 2017/1/9.
 */
public class Displayer {
    public static void show(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
}
