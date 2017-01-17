/**
 * Created by Administrator on 2017/1/16.
 */
public class Asc extends Direction {
    public Asc(Algorithm algorithm) {
        super(algorithm);
    }

    @Override
    public int compare(int left, int right) {
        return left - right;
    }
}
