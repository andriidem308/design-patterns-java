package homework15.task_3_1;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {

        // Lamps
        Lamp kitchenLamp = new Lamp("Kitchen");
        Lamp hallLamp = new Lamp("Hall");
        Lamp bedroomLamp = new Lamp("Bedroom");
        Lamp bathroomLamp = new Lamp("Bathroom");

        // Separate commands
        Command kitchenLampCommand = new LampCommand(kitchenLamp);
        Command hallLampCommand = new LampCommand(hallLamp);
        Command bedroomLampCommand = new LampCommand(bedroomLamp);
        Command bathroomLampCommand = new LampCommand(bathroomLamp);

        // Universal command contains all the commands
        ArrayList<Command> allCommands = new ArrayList<>();
        allCommands.add(kitchenLampCommand);
        allCommands.add(hallLampCommand);
        allCommands.add(bedroomLampCommand);
        allCommands.add(bathroomLampCommand);
        Command universalCommand = new UniversalCommand(allCommands);

        // Controllers
        Controller controllerKitchenLamp = new Controller();
        Controller controllerHallLamp = new Controller();
        Controller controllerBedroomLamp = new Controller();
        Controller controllerBathroomLamp = new Controller();
        Controller controllerUniversal = new Controller();

        controllerKitchenLamp.setCommand(kitchenLampCommand);
        controllerHallLamp.setCommand(hallLampCommand);
        controllerBedroomLamp.setCommand(bedroomLampCommand);
        controllerBathroomLamp.setCommand(bathroomLampCommand);
        controllerUniversal.setCommand(universalCommand);

        // Simulation
        controllerKitchenLamp.on();
        controllerHallLamp.on();
        controllerBedroomLamp.on();

        controllerKitchenLamp.off();
        controllerHallLamp.off();
        controllerBedroomLamp.off();

        controllerBedroomLamp.on();
        controllerBathroomLamp.on();

        controllerUniversal.off();

    }
}
