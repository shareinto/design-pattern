/**
 * Created by Administrator on 2017/1/16.
 */
public abstract class SorterDecorator implements Sorter {
    private Sorter sorter;

    public SorterDecorator(Sorter sorter) {
        this.sorter = sorter;
    }

    public void sort(int[] array) {
        sorter.sort(array);
    }
}
