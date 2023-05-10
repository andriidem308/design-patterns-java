package homework5.task_3_2;


public class Car implements Cloneable {
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

    public Car(Car other) {
        this.bodyType = other.bodyType;
        this.color = other.color;
        this.engine = other.engine;
        this.transmission = other.transmission;
        this.rubber = other.rubber;
        this.wheel = other.wheel;
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

    @Override
    public Car clone() {
        return new Car(this);
    }
}
