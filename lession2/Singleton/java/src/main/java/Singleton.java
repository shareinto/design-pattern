/**
 * Created by Administrator on 2016/12/18.
 */
public class Singleton {
    public static void main(String[] args)
    {
        System.out.println(Singleton.class == Singleton.class);
    }
    private volatile static Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }
}
