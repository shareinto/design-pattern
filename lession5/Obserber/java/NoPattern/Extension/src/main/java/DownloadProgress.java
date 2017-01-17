import java.text.DecimalFormat;

/**
 * Created by Administrator on 2017/1/17.
 */
public class DownloadProgress {
    public void update(int read, int total) {
        System.out.println(String.format("%s/%s %s%%",
                read, total,
                formatDouble((double) read / total * 100)));
    }

    public void complete() {
        System.out.println("download has complete");
    }

    public static String formatDouble(double d) {
        DecimalFormat df = new DecimalFormat("#");
        return df.format(d);
    }
}
