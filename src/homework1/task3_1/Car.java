package homework1.task3_1;

public class Car {

    private String brand;
    private String model;
    private Engine engine;
    private Wheel wheel;

    public Car(String brand, String model, Engine engine, Wheel wheel) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.wheel = wheel;
    }
    
    public Engine getEngine() {
        return engine;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public String getCarInfo() {
        String result = "Brand: " + this.brand + "\nModel: " + this.model + "\n";
        result += this.engine.getEngineInfo() + "\n" + this.wheel.getWheelInfo();
        return result;
    }
}
