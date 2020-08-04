package pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class NProxyFactory<T> {

    private  T object;

    public NProxyFactory(T object) {
        this.object = object;
    }
    public T getProxyInstance() {
        return (T)Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("JDK动态代理开始");
                Object returnValue =method.invoke(object,args);
                System.out.println("JDK动态代理结束");
                return returnValue;
            }
        });
    }
}
