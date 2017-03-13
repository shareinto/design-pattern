/**
 * Created by Administrator on 2017/3/13.
 */
public class Light {
    private State state;

    public Light(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void press() {
        this.state.handle(this);
    }
}
