package homework1.task3_1;

public class CarSimulator {
    private CarBuilder carBuilder;
    private Car car;

    public CarSimulator() {
        this.carBuilder = new CarBuilder();
    }

    public void buildCar(String brand, String model, int power, double volume, int size) {
        this.car = carBuilder.buildCar(brand, model, power, volume, size);
    }

    public void getCarInfo() {
        System.out.println(car.getCarInfo());
    }
}
