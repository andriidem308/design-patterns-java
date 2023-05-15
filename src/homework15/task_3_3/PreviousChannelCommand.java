package homework15.task_3_3;

public class PreviousChannelCommand implements Command {
    private final Device device;

    public PreviousChannelCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.prevChannel();
    }
}
