/**
 * Created by Administrator on 2017/1/16.
 */
public abstract class Direction implements Sorter {
    private Algorithm algorithm;

    public Direction(Algorithm algorithm) {
        this.algorithm = algorithm;
    }

    public void sort(int[] array) {
        this.algorithm.sort(array, this);
    }

    public abstract int compare(int left, int right);
}
