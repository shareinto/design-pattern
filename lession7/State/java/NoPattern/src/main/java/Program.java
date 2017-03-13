import java.util.List;

/**
 * Created by Administrator on 2017/3/13.
 */
public class Program {
    public static void main(String[] args) {
        final Light light = new Light();
        new Thread(new Runnable() {
            public void run() {
                while (true) {
                    System.out.println(light.getState());
                    light.press();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
