package homework1.task3_1;

public class CarBuilder {

    public Car buildCar(String brand, String model, int power, double volume, int size) {
        Engine engine = new Engine(power, volume);
        Wheel wheel = new Wheel(size);
        return new Car(brand, model, engine, wheel);
    }

}
