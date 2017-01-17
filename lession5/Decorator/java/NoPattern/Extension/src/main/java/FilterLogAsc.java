import java.io.PrintStream;

/**
 * Created by Administrator on 2017/1/16.
 */
public class FilterLogAsc extends Asc{
    private Filter filter;
    private PrintStream out;

    public FilterLogAsc(Algorithm algorithm, Filter filter,PrintStream out) {
        super(algorithm);
        this.filter = filter;
        this.out = out;
    }

    @Override
    public void sort(int[] array) {
        super.sort(array);
        if (filter != null) {
            for (int i = 0; i < array.length; i++) {
                if (filter.filter(array[i])) {
                    removeElementFromArray(array, i);
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            out.println(array[i]);
        }
    }

    private void removeElementFromArray(int[] array, int index) {
        if (index < 0 || index > array.length - 1) {
            return;
        }
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
    }

    public interface Filter {
        public boolean filter(int input);
    }
}
