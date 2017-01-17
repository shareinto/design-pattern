import java.io.PrintStream;

/**
 * Created by Administrator on 2017/1/16.
 */
public class LogSorter extends SorterDecorator {
    private PrintStream out;

    public LogSorter(Sorter sorter, PrintStream out) {
        super(sorter);
        this.out = out;
    }

    @Override
    public void sort(int[] array) {
        super.sort(array);
        for (int i = 0; i < array.length; i++) {
            out.println(array[i]);
        }
    }
}
