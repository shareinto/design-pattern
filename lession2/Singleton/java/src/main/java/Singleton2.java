/**
 * Created by Administrator on 2016/12/18.
 */
public class Singleton2 {
    private static class SingletonHolder {
        private static final Singleton2 instance = new Singleton2();
    }
    private Singleton2 (){}
    public static final Singleton2 getInstance() {
        return SingletonHolder.instance;
    }
}
