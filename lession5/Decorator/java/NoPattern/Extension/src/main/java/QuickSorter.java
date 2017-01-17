/**
 * Created by Administrator on 2017/1/16.
 */
public class QuickSorter implements Algorithm {
    public void sort(int[] array, Direction direction) {
        quickSort(array, 0, array.length - 1, direction);
    }

    private void quickSort(int[] arr, int low, int high, Direction direction) {
        if (arr == null || arr.length == 0)
            return;
        if (low >= high)
            return;
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];
        int i = low, j = high;
        while (i <= j) {
            while (direction.compare(arr[i], pivot) < 0) {
                i++;
            }
            while (direction.compare(arr[j], pivot) > 0) {
                j--;
            }
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(arr, low, j, direction);

        if (high > i)
            quickSort(arr, i, high, direction);
    }
}
