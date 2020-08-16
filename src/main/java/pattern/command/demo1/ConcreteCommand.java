package pattern.command.demo1;

public class ConcreteCommand  extends Command{
    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    public ConcreteCommand() {
        setReceiver(new Receiver());
    }

    @Override
    public void excute() {
        receiver.action();
    }
}
