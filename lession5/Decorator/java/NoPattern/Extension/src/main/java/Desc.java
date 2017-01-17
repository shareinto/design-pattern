/**
 * Created by Administrator on 2017/1/16.
 */
public class Desc extends Direction {
    public Desc(Algorithm algorithm) {
        super(algorithm);
    }

    @Override
    public int compare(int left, int right) {
        return right - left;
    }
}
