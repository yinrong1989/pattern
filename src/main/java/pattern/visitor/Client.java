package pattern.visitor;

public class Client {


    public static void main(String[] args) {

        ObjectStructure objectStructure = new ObjectStructure();

        objectStructure.attach(new Man());

        objectStructure.attach(new Woman());

        Action success = new Success();

        objectStructure.display(success);

        System.out.println("-----------------");

        Action fail = new Fail();

        objectStructure.display(fail);
        System.out.println("=======给的是待定的测评========");

        Action wait = new Wait();
        objectStructure.display(wait);
    }
}
