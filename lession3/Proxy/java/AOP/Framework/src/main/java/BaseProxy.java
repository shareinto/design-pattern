import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2016/12/26.
 */
public abstract class BaseProxy implements InvocationHandler
{
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
    {
        Object result;
        try
        {
            this.doBegin();
            result = method.invoke(proxy, args);
        } catch(InvocationTargetException e)
        {    throw e.getTargetException();
        } catch(Exception e)
        {    throw new RuntimeException("upexpected invocation exception: " + e.getMessage());
        } finally
        {    this.doAfter();
        }
        return result;
    }
    public abstract void doBegin();
    public abstract void doAfter();
}
