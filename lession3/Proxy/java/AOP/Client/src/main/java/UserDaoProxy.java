/**
 * Created by Administrator on 2016/12/26.
 */
public class UserDaoProxy extends BaseProxy {
    @Override
    public void doBegin() {
        System.out.println("before save user");
    }

    @Override
    public void doAfter() {
        System.out.println("after save user");
    }
}
