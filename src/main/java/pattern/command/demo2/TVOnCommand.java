package pattern.command.demo2;

public class TVOnCommand implements Command{

    TVReceiver receiver;

    public TVOnCommand(TVReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
         receiver.on();
    }

    @Override
    public void undo() {
         receiver.off();
    }
}
