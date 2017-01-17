/**
 * Created by Administrator on 2017/1/16.
 */
public class BubbleSorter implements Algorithm {
    public void sort(int[] array, Direction direction) {
        int i, j;
        for (i = 0; i < array.length; i++) {
            for (j = array.length - 1; j > i; j--) {
                int a = array[j];
                int b = array[j - 1];
                int result = 0;
                result = direction.compare(a, b);
                if (result < 0) {
                    array[j] = array[j] + array[j - 1];
                    array[j - 1] = array[j] - array[j - 1];
                    array[j] = array[j] - array[j - 1];
                }
            }
        }
    }
}
