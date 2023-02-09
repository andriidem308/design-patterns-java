package homework1.task3_1;

public class Task3_1_Main {
    public static void main(String[] args) {
        CarSimulator carSimulator = new CarSimulator();
        carSimulator.buildCar("Toyota", "Camry", 250, 3.5, 15);
        carSimulator.getCarInfo();
    }
}