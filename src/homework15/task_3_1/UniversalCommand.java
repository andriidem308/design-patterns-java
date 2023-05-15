package homework15.task_3_1;

import java.util.ArrayList;

public class UniversalCommand implements Command {
    private final ArrayList<Command> commandsList;

    public UniversalCommand(ArrayList<Command> commandsList) {
        this.commandsList = commandsList;
    }

    @Override
    public void on() {
        for (Command command : commandsList) {
            command.on();
        }
    }

    @Override
    public void off() {
        for (Command command : commandsList) {
            command.off();
        }
    }
}
