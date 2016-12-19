/**
 * Created by Administrator on 2016/12/18.
 */
public abstract class IntArraySearcher {
    public boolean contains(int[] array,int element) {
        Sorter sorter = factoryMethod();
        sorter.sort(array);
        return false;
    }

    public abstract Sorter factoryMethod();
}
