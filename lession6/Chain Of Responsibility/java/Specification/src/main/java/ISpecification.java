/**
 * Created by Administrator on 2017/2/27.
 */
public interface ISpecification<T> {
    public boolean isSatisfiedBy(T o);

    public ISpecification<T> And(ISpecification<T> right);
    public ISpecification<T> Or(ISpecification<T> right);
    public ISpecification<T> Not();
}
