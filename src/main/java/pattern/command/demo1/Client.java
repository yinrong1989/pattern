package pattern.command.demo1;

public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        invoker.setCommand(command);
        invoker.executeCommond();

        Invoker invoker2 = new Invoker();
        invoker2.setCommand(new ConcreteCommand());
        invoker2.executeCommond();

    }
}
