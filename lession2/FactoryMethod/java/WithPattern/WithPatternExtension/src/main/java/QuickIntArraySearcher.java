/**
 * Created by Administrator on 2016/12/18.
 */
public class QuickIntArraySearcher extends IntArraySearcher {
    @Override
    public Sorter factoryMethod() {
        return new QuickSorter();
    }
}
