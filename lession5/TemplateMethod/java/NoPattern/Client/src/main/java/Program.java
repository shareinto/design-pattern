import java.io.BufferedWriter;
import java.nio.ByteBuffer;

/**
 * Created by Administrator on 2016/12/18.
 */
public class Program {
    public static void main(String[] args) {
        int[] array = {5, 7, 2, 1, 8, 0, 6, 3, 4, 9};
        IntArraySearcher  searcher = new IntArraySearcher(new AscBubbleSorter());
        System.out.println(searcher.contains(array, 11));
    }
}
