package homework15.task_3_3;

import java.util.ArrayList;


public class UniversalTurnOffCommand implements Command {
    private ArrayList<Device> devicesList = new ArrayList<>();

    public UniversalTurnOffCommand(ArrayList<Device> devicesList) {
        this.devicesList = devicesList;
    }

    @Override
    public void execute() {
        for (Device device: devicesList) {
            device.off();
        }
    }
}
