/**
 * Created by Administrator on 2017/3/13.
 */
public interface State {
    public String getState();
    public void handle(Light light);
}
