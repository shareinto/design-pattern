/**
 * Created by Administrator on 2017/3/13.
 */
public class Low implements State {
    private String state = "微亮";

    public String getState() {
        return this.state;
    }

    public void handle(Light light) {
        light.setState(new High());
    }
}
