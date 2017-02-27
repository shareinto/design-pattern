/**
 * Created by Administrator on 2017/2/27.
 */
public abstract class Handler<T> {
    private Handler handler;
    private ISpecification<T> specification;

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public void setSpecification(ISpecification<T> specification) {
        this.specification = specification;
    }

    public void handleRequest(T mobile) {
        if (canHandle(mobile)) {
            System.out.println(String.format("%s handled request %s",
                    this.getClass().getName(), mobile));
        } else if (handler != null) {
            handler.handleRequest(mobile);
        }

    }

    public boolean canHandle(T mobile) {
        return this.specification.isSatisfiedBy(mobile);
    }
}
