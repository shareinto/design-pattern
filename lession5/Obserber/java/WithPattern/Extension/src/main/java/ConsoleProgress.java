import java.text.DecimalFormat;

/**
 * Created by Administrator on 2017/1/17.
 */
public class ConsoleProgress implements Progress {
    public void update(State state) {
        if (state.isCompleted()) {
            System.out.println("download has complete");
        } else {
            System.out.println(String.format("%s/%s %s%%",
                    state.getRead(), state.getTotal(),
                    formatDouble((double) state.getRead() / state.getTotal() * 100)));
        }
    }

    public static String formatDouble(double d) {
        DecimalFormat df = new DecimalFormat("#");
        return df.format(d);
    }
}
