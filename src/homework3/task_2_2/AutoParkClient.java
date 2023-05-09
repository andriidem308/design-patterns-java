package homework3.task_2_2;

import java.util.ArrayList;
import java.util.Scanner;

public class AutoParkClient {
    private final VolvoFactory volvoFactory = new VolvoFactory();
    private final SkodaFactory skodaFactory = new SkodaFactory();
    private final HyundaiFactory hyundaiFactory = new HyundaiFactory();

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter distance (in 1000 km): ");
        Long distance = Long.parseLong(scanner.next()) * 1000;

        System.out.println("Enter number of buses: ");
        Integer busesNumber = Integer.parseInt(scanner.next());

        System.out.println("Enter number of trolleybuses: ");
        Integer trolleybusesNumber = Integer.parseInt(scanner.next());

        System.out.println("Enter number of tramways: ");
        Integer tramwaysNumber = Integer.parseInt(scanner.next());

        ArrayList<Car> volvoPark = createCars(volvoFactory, busesNumber, trolleybusesNumber, tramwaysNumber);
        ArrayList<Car> skodaPark = createCars(skodaFactory, busesNumber, trolleybusesNumber, tramwaysNumber);
        ArrayList<Car> hyundaiPark = createCars(hyundaiFactory, busesNumber, trolleybusesNumber, tramwaysNumber);

        Long volvoCost = calculateCost(volvoPark, distance);
        Long skodaCost = calculateCost(skodaPark, distance);
        Long hyundaiCost = calculateCost(hyundaiPark, distance);

        String bestManufacturer;

        if (volvoCost <= skodaCost && volvoCost <= hyundaiCost) {
            bestManufacturer = "Volvo";
        }
        else if (skodaCost <= volvoCost && skodaCost <= hyundaiCost) {
            bestManufacturer = "Skoda";
        }
        else {
            bestManufacturer = "Hyundai";
        }

        System.out.printf("The best manufacturer of cars: %s", bestManufacturer);
    }

    private ArrayList<Car> createCars(CarFactory factory, Integer busesNumber, Integer trolleybusesNumber, Integer tramwaysNumber) {
        ArrayList<Car> carsList = new ArrayList<>();

        for (int i = 0; i < busesNumber; i++) {
            carsList.add(factory.createBus());
        }

        for (int i = 0; i < trolleybusesNumber; i++) {
            carsList.add(factory.createTrolleybus());
        }

        for (int i = 0; i < tramwaysNumber; i++) {
            carsList.add(factory.createTramway());
        }

        return carsList;
    }

    private Long calculateCost(ArrayList<Car> cars, Long distance) {
        long result = 0;

        for (Car car: cars) {
            result += car.getVehicleCost() + car.getDistanceCost(distance);
        }

        return result;
    }
}
