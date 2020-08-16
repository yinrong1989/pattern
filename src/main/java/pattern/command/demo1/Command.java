package pattern.command.demo1;

public abstract class Command {

    protected  Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    public Command() {
    }

    public Receiver getReceiver() {
        return receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    public abstract  void excute();
}
