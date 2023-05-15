package homework15.task_3_1;

public class Controller {
    private Command command;

    public void on() {
        command.on();
    }

    public void off() {
        command.off();
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
