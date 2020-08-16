package pattern.command.demo1;

public class Invoker {

    private Command command;

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }
    public  void executeCommond(){
        this.command.excute();
    }
}
