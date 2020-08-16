package pattern.command.demo2;

public class RemoteController {

    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteController() {

        onCommands = new Command[5];
        offCommands = new Command[5];

        for (int i=0;i<5;i++){
            onCommands[i]=new NoCommand();
            offCommands[i]=new NoCommand();
        }
    }

    public void setCommands(Command[] onCommands,Command[] offCommands) {
        this.onCommands =onCommands;
        this.offCommands = offCommands;
    }
    public void setCommand(int number,Command onCommand,Command  offCommand) {
        onCommands[number] = onCommand;
        offCommands[number] = offCommand;
    }
    public void onButtonPush(int number){
       onCommands[number].execute();
       undoCommand=onCommands[number];
    }
    public void offButtonPush(int number){
        offCommands[number].execute();
        undoCommand =offCommands[number];
    }
    public void undoButtonWasPushed(){
        System.out.println("撤销命令");
        undoCommand.undo();
    }
}
