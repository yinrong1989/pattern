package pattern.proxy;

public class JDKDynamicClient {
    public static void main(String[] args) {
        ITeacher teacher = new Teacher();
        ITeacher proxyTeacher = (ITeacher) new ProxyFactory(teacher).getProxyInstance();
        ITeacher nproxyTeacher = new NProxyFactory<>(teacher).getProxyInstance();
      //  proxyTeacher.teach();
        nproxyTeacher.teach();
    }
}
