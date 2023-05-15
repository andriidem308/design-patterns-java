package homework15.task_3_1;

public class LampCommand implements Command {
    private final Lamp lamp;

    public LampCommand(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void on() {
        lamp.lightOn();
    }

    @Override
    public void off() {
        lamp.lightOff();
    }
}
