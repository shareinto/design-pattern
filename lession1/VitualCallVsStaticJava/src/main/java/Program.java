/**
 * Created by Administrator on 2016/12/1.
 */
public class Program {
    public static void main(String[] args) {
        int count = 1000000000;
        while (true) {
            System.out.println("dispatch: " + dispath(count));
            System.out.println("non-dispatch: " + nonDispath(count));
        }
    }

    private static long dispath(int count)
    {
        long begin = System.currentTimeMillis();
        Base b = new Derive();
        while(count --> 0)
        {
            b.increase();
        }
        long end = System.currentTimeMillis();
        return end - begin;
    }

    private static long nonDispath(int count)
    {
        long begin = System.currentTimeMillis();
        Alone a = new Alone();
        while(count --> 0)
        {
            a.increase();
        }
        long end = System.currentTimeMillis();
        return end - begin;
    }
}
