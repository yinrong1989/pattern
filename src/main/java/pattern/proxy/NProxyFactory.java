package pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class NProxyFactory<T> {

    private T target;

    public NProxyFactory(T object) {
        this.target = object;
    }

    public T getProxyInstance() {
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("JDK动态代理开始1");
                Object returnValue = method.invoke(target, args);
                System.out.println("JDK动态代理结束1");
                return returnValue;
            }
        });
    }
}
