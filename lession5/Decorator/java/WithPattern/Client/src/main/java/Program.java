/**
 * Created by Administrator on 2016/12/18.
 */
public class Program {
    public static void main(String[] args) {
        int[] array = {5, 7, 2, 1, 8, 0, 6, 3, 4, 9};
        Sorter sorter = new Asc(new QuickSorter());
//        sorter = new FilterSorter(sorter, new FilterSorter.Filter() {
//            public boolean filter(int input) {
//                return input == 1
//                        || input == 2
//                        || input == 3;
//            }
//        });
        //sorter = new LogSorter(sorter, System.out);
        IntArraySearcher searcher = new IntArraySearcher(
                sorter);
        System.out.println(searcher.contains(array, 4));
    }
}
