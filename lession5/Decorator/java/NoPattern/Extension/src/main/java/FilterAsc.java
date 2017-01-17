/**
 * Created by Administrator on 2017/1/16.
 */
public class FilterAsc extends Asc {
    private Filter filter;

    public FilterAsc(Algorithm algorithm, Filter filter) {
        super(algorithm);
        this.filter = filter;
    }

    @Override
    public void sort(int[] array) {
        super.sort(array);
        if (filter != null) {
            for (int i = 0; i < array.length; i++) {
                while (filter.filter(array[i])) {
                    removeElementFromArray(array, i);
                }
            }
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
