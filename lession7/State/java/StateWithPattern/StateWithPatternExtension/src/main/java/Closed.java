/**
 * Created by Administrator on 2017/3/13.
 */
public class Closed implements State {
    private String state = "关闭";

    public String getState() {
        return this.state;
    }

    public void handle(Light light) {
        light.setState(new Low());
    }
}
