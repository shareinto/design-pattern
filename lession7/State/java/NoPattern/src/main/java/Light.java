/**
 * Created by Administrator on 2017/3/13.
 */
public class Light {
    private String state = "关";

    public String getState() {
        return state;
    }

    public void press() {
        if (state.equals("关")) {
            state = "开";
        } else if (state.equals("开")) {
            state = "关";
        }
    }
}
