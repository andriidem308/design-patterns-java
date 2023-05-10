package homework4.task_3_1;


public class Car {
    private final BodyType bodyType;
    private final String color;
    private final Engine engine;
    private final Rubber rubber;
    private final Transmission transmission;
    private final Wheel wheel;

    public Car(BodyType bodyType, String color, Engine engine, Transmission transmission, Rubber rubber, Wheel wheel) {
        this.bodyType = bodyType;
        this.color = color;
        this.engine = engine;
        this.transmission = transmission;
        this.rubber = rubber;
        this.wheel = wheel;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public String getColor() {
        return color;
    }

    public Engine getEngine() {
        return engine;
    }

    public Rubber getRubber() {
        return rubber;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public Wheel getWheel() {
        return wheel;
    }

    @Override
    public String toString() {
        String result = "";
        result += "----- Car -----\n";
        result += "Body Type: " + getBodyType() + "\n";
        result += "Color: " + getColor() + "\n";
        result += "Engine: " + getEngine() + "\n";
        result += "Rubber: " + getRubber() + "\n";
        result += "Transmission: " + getTransmission() + "\n";
        result += "Wheel: " + getWheel() + "\n";
        return result;
    }
}
