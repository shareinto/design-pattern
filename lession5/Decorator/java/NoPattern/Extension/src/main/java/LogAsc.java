import java.io.PrintStream;

/**
 * Created by Administrator on 2017/1/16.
 */
public class LogAsc extends Asc {
    private PrintStream out;

    public LogAsc(Algorithm algorithm, PrintStream out) {
        super(algorithm);
        this.out = out;
    }

    @Override
    public void sort(int[] array) {
        super.sort(array);
        for (int i = 0; i < array.length; i++) {
            out.println(array[i]);
        }
    }
}
