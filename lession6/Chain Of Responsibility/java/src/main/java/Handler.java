/**
 * Created by Administrator on 2017/2/27.
 */
public abstract class Handler {
    protected Handler handler;

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public void handleRequest(Mobile mobile) {
        if (canHandle(mobile)) {
            System.out.println(String.format("%s handled request %s",
                    this.getClass().getName(), mobile));
        } else if (handler != null) {
            handler.handleRequest(mobile);
        }
    }

    public abstract boolean canHandle(Mobile mobile);
}
