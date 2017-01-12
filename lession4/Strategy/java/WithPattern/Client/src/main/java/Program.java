/**
 * Created by Administrator on 2016/12/18.
 */
public class Program {
    public static void main(String[] args) {

        int[] array = {5, 7, 2, 1, 8, 0, 6, 3, 4, 9};
        Sorter sorter = null;
        if (array.length > 50) {
            sorter = new QuickSorter();
        } else {
            sorter = new BubbleSorter();
        }
        IntArraySearcher searcher = new IntArraySearcher(sorter);
        System.out.println(searcher.contains(array, 9));
    }
}
