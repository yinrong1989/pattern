package pattern.command.demo2;

public class TVOffCommand implements Command {

    TVReceiver tvReceiver;

    public TVOffCommand(TVReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        tvReceiver.off();
    }

    @Override
    public void undo() {
         tvReceiver.on();
    }
}
