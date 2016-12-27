import com.alibaba.fastjson.JSON;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by Administrator on 2016/12/27.
 */
public class UserDaoProxy implements UserDao {
    public void save(User user) {
        try {
            Socket socket = new Socket("172.24.133.71", 8888);
            String json = JSON.toJSONString(user);
            OutputStream os =  socket.getOutputStream();
            DataOutputStream bos = new DataOutputStream(os);
            bos.writeUTF(json);
            bos.flush();
            socket.close();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
