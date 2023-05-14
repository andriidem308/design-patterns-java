package homework12.task_2_2;

import java.util.HashMap;


public class EngineFlyweight {
    private final HashMap<String, Engine> enginesContainer = new HashMap<>();

    public Engine getEngine(int power, Engine.Fuel fuel) {
        String engineKey = String.format("%s_%s", fuel, power);

        Engine engineValue = enginesContainer.get(engineKey);

        if (engineValue == null) {
            engineValue = new Engine(power, fuel);
            enginesContainer.put(engineKey, engineValue);
        }

        return engineValue;
    }
}
