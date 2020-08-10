package pattern.proxy;

public class CGlibDynamicClient {
    public static void main(String[] args) {
        ITeacher teacher = new Teacher();
        ITeacher proxyTeacher = (ITeacher) new ProxyFactory(teacher).getProxyInstance();
        ITeacher nproxyTeacher = new NProxyFactory<>(teacher).getProxyInstance();
        proxyTeacher.teach();
        proxyTeacher.sayHello();
         nproxyTeacher.teach();
         nproxyTeacher.sayHello();
    }
}
