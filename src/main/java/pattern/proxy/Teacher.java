package pattern.proxy;

public class Teacher implements ITeacher{

    @Override
    public void teach() {
        System.out.println("老师在上课");
    }

    @Override
    public void sayHello() {
        System.out.println("老师在sayHello");
    }
}
