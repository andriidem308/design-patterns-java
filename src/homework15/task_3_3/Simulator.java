package homework15.task_3_3;

import java.util.ArrayList;


public class Simulator {
    public static void main(String[] args) {
        // TV
        Device tv = new Television();
        Command tvTurnOn = new TurnOnCommand(tv);
        Command tvTurnOff = new TurnOffCommand(tv);
        Command tvNextChanel = new NextChannelCommand(tv);
        Command tvPreviousChanel = new PreviousChannelCommand(tv);
        Command tvVolumeUp = new VolumeUpCommand(tv);
        Command tvVolumeDown = new VolumeDownCommand(tv);

        RemoteController tvController = new RemoteController();
        tvController.setTurnOnCommand(tvTurnOn);
        tvController.setTurnOffCommand(tvTurnOff);
        tvController.setNextChannelCommand(tvNextChanel);
        tvController.setPreviousChannelCommand(tvPreviousChanel);
        tvController.setVolumeUpCommand(tvVolumeUp);
        tvController.setVolumeDownCommand(tvVolumeDown);

        tvController.deviceOn();
        for (int i = 0; i < 30; i++) {
            tvController.deviceNextChannel();
        }
        tvController.deviceVolumeUp();
        tvController.deviceVolumeUp();
        tvController.deviceVolumeUp();
        tvController.devicePrevChannel();
        tvController.deviceVolumeDown();
        tvController.deviceOff();

        // Radio
        Device radio = new Radio();
        Command radioTurnOn = new TurnOnCommand(radio);
        Command radioTurnOff = new TurnOffCommand(radio);
        Command radioNextChanel = new NextChannelCommand(radio);
        Command radioPreviousChanel = new PreviousChannelCommand(radio);
        Command radioVolumeUp = new VolumeUpCommand(radio);
        Command radioVolumeDown = new VolumeDownCommand(radio);

        RemoteController radioController = new RemoteController();
        radioController.setTurnOnCommand(radioTurnOn);
        radioController.setTurnOffCommand(radioTurnOff);
        radioController.setNextChannelCommand(radioNextChanel);
        radioController.setPreviousChannelCommand(radioPreviousChanel);
        radioController.setVolumeUpCommand(radioVolumeUp);
        radioController.setVolumeDownCommand(radioVolumeDown);

        radioController.deviceOn();
        for (int i = 0; i < 30; i++) {
            radioController.deviceNextChannel();
        }
        radioController.deviceVolumeUp();
        radioController.deviceVolumeUp();
        radioController.deviceVolumeUp();
        radioController.devicePrevChannel();
        radioController.deviceVolumeDown();
        radioController.deviceOff();

        // Universal
        ArrayList<Device> devicesList = new ArrayList<>();
        devicesList.add(tv);
        devicesList.add(radio);

        RemoteController universalController = new RemoteController();
        Command universalTurnOff = new UniversalTurnOffCommand(devicesList);
        universalController.setTurnOffCommand(universalTurnOff);

        tvController.deviceOn();
        radioController.deviceOn();
        universalController.deviceOff();
    }
}
