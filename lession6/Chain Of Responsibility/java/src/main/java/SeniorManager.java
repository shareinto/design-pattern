/**
 * Created by Administrator on 2017/2/27.
 */
public class SeniorManager extends Handler {
    @Override
    public boolean canHandle(Mobile mobile) {
        return mobile.getType().equals("Premium");
    }
}
