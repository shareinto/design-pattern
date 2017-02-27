/**
 * Created by Administrator on 2017/2/27.
 */
public class Specification<T> implements ISpecification<T> {

    private IExpression<T> expression;

    public Specification(IExpression<T> expression) {
        this.expression = expression;
    }

    public boolean isSatisfiedBy(T o) {
        return this.expression.isSatisfiedBy(o);
    }

    public ISpecification<T> And(final ISpecification<T> right) {
        return new Specification<T>(new IExpression<T>() {
            public boolean isSatisfiedBy(T o) {
                return Specification.this.isSatisfiedBy(o) && right.isSatisfiedBy(o);
            }
        });
    }

    public ISpecification<T> Or(final ISpecification<T> right) {
        return new Specification<T>(new IExpression<T>() {
            public boolean isSatisfiedBy(T o) {
                return Specification.this.isSatisfiedBy(o) || right.isSatisfiedBy(o);
            }
        });
    }

    public ISpecification<T> Not() {
        return new Specification<T>(new IExpression<T>() {
            public boolean isSatisfiedBy(T o) {
                return !Specification.this.isSatisfiedBy(o);
            }
        });
    }

}
