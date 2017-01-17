/**
 * Created by Administrator on 2017/1/16.
 */
public class DescBubbleSorter extends BubbleSorter {
    @Override
    public int compare(int left, int right) {
        return right - left;
    }
}
