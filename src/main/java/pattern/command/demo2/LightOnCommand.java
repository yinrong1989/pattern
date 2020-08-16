package pattern.command.demo2;

import pattern.command.demo2.Command;

public class LightOnCommand implements Command {
    LightReceiver light;

    public LightOnCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
         light.on();
    }

    @Override
    public void undo() {
      light.off();
    }
}
