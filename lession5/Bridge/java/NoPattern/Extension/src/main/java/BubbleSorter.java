/**
 * Created by Administrator on 2017/1/16.
 */
public abstract class BubbleSorter implements Sorter {
    public void sort(int[] array) {
        int i, j;
        for (i = 0; i < array.length; i++) {
            for (j = array.length - 1; j > i; j--) {
                int a = array[j];
                int b = array[j - 1];
                int result = 0;
                result = compare(a, b);
                if (result < 0) {
                    array[j] = array[j] + array[j - 1];
                    array[j - 1] = array[j] - array[j - 1];
                    array[j] = array[j] - array[j - 1];
                }
            }
        }
    }

    public abstract int compare(int left, int right);
}
