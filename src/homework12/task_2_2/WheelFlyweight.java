package homework12.task_2_2;

import java.util.HashMap;


public class WheelFlyweight {
    private final HashMap<String, Wheel> wheelsContainer = new HashMap<>();

    public Wheel getWheel(int diameter) {
        String wheelMaterial = Wheel.Material.Steel.toString();
        String wheelKey = String.format("%s_%d", wheelMaterial, diameter);

        Wheel wheelValue = wheelsContainer.get(wheelKey);

        if (wheelValue == null) {
            wheelValue = new Wheel(diameter);
            wheelsContainer.put(wheelKey, wheelValue);
        }

        return wheelValue;
    }
}
