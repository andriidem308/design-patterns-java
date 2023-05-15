package homework15.task_3_3;


public class RemoteController {
    private Command turnOnCommand;
    private Command turnOffCommand;
    private Command volumeUpCommand;
    private Command volumeDownCommand;
    private Command nextChannelCommand;
    private Command previousChannelCommand;

    public void setTurnOnCommand(Command turnOnCommand) {
        this.turnOnCommand = turnOnCommand;
    }

    public void setTurnOffCommand(Command turnOffCommand) {
        this.turnOffCommand = turnOffCommand;
    }

    public void setVolumeUpCommand(Command volumeUpCommand) {
        this.volumeUpCommand = volumeUpCommand;
    }

    public void setVolumeDownCommand(Command volumeDownCommand) {
        this.volumeDownCommand = volumeDownCommand;
    }

    public void setNextChannelCommand(Command nextChannelCommand) {
        this.nextChannelCommand = nextChannelCommand;
    }

    public void setPreviousChannelCommand(Command previousChannelCommand) {
        this.previousChannelCommand = previousChannelCommand;
    }

    void deviceOn() {
        turnOnCommand.execute();
    }

    void deviceOff() {
        turnOffCommand.execute();
    }

    void deviceVolumeUp() {
        volumeUpCommand.execute();
    }

    void deviceVolumeDown() {
        volumeDownCommand.execute();
    }

    void deviceNextChannel() {
        nextChannelCommand.execute();
    }

    void devicePrevChannel() {
        previousChannelCommand.execute();
    }
}
