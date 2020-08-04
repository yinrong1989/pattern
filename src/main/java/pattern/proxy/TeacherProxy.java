package pattern.proxy;

public class TeacherProxy implements ITeacher {
    ITeacher teacher;

    public TeacherProxy() {
    }

    public TeacherProxy(ITeacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public void teach() {
        System.out.println("proxy前");
        teacher.teach();
        System.out.println("proxy后");


    }
}
