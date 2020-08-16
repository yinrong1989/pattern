package pattern.command.demo2;

import java.rmi.Remote;

public class Client {


    public static void main(String[] args) {
        LightReceiver lightReceiver = new LightReceiver();
        TVReceiver tvReceiver = new TVReceiver();

        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);

        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        TVOnCommand tvOnCommand = new TVOnCommand(tvReceiver);
        TVOffCommand tvOffCommand = new TVOffCommand(tvReceiver);

        RemoteController remoteController = new RemoteController();
        remoteController.setCommand(0,lightOnCommand,lightOffCommand);
        remoteController.setCommand(1,tvOnCommand,tvOffCommand);
        remoteController.onButtonPush(0);
        remoteController.undoButtonWasPushed();
        remoteController.onButtonPush(1);
        remoteController.undoButtonWasPushed();
        remoteController.offButtonPush(1);
        remoteController.undoButtonWasPushed();
        remoteController.offButtonPush(0);
        remoteController.undoButtonWasPushed();

    }
}
