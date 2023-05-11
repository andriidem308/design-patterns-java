package homework6.task_6_3_2;


public class CarBuilder implements Builder {
    private BodyType bodyType;
    private String color;
    private Engine engine;
    private Transmission transmission;
    private Rubber rubber;
    private Wheel wheel;

    @Override
    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setRubber(Rubber rubber) {
        this.rubber = rubber;
    }

    @Override
    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    @Override
    public Car build() {
        return new Car(bodyType, color, engine, transmission, rubber, wheel);
    }
}
