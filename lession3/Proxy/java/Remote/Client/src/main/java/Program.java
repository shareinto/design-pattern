import com.alibaba.fastjson.JSON;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by Administrator on 2016/12/27.
 */
public class Program {
    public static void main(String[] args) throws IOException, InterruptedException {
        UserDao userDao = new UserDaoProxy();
        User user = new User();
        user.setName("jackson");
        userDao.save(user);
        user.setName("tom");
        userDao.save(user);
    }
}
