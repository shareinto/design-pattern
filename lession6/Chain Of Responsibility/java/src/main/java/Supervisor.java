/**
 * Created by Administrator on 2017/2/27.
 */
public class Supervisor extends Handler {
    @Override
    public boolean canHandle(Mobile mobile) {
        return mobile.getType().equals("Budget");
    }
}
