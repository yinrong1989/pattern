package pattern.proxy;

public class StaticProxyClient {


    public static void main(String[] args) {
        ITeacher proxy = new TeacherProxy(new Teacher());

        proxy.teach();
    }


}
