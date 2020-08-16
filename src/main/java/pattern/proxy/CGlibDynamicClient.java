package pattern.proxy;

public class CGlibDynamicClient {
    public static void main(String[] args) {
        ITeacher teacher = new Teacher();
        ITeacher proxyTeacher = (ITeacher) new CGlibProxyFactory(teacher).getProxyInstance();
        proxyTeacher.teach();
        proxyTeacher.sayHello();

    }
}
