/**
 * Created by Administrator on 2016/12/26.
 */
public class Program {
    public static void main(String[] args) throws Throwable {
        //BaseProxy proxy = new UserDaoProxy();
        //proxy.invoke(new UserDao(), UserDao.class.getMethod("save", User.class), new Object[]{null});
        new UserDao(){
            private void doBegin()
            {

            }
            private void doAfter()
            {

            }

            @Override
            public void save(User user) {
                doBegin();
                super.save(user);
                doAfter();
            }
        }.save(new User());
    }
}
