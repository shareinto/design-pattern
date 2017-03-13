/**
 * Created by Administrator on 2017/3/13.
 */
public abstract class Colleague {
    private Mediator mediator;
    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
    public Mediator getMediator() {
        return mediator;
    }
}
