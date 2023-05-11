package homework7.task_3_2;

import homework7.task_3_2.UACustoms.Auto;
import com.vehiclecalculator.CarCalculator;
import com.vehiclecalculator.Vehicle;
import com.vehiclecalculator.VehicleCalculator;


public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(7, "Mercedes", 0.75f, 150000);

        VehicleCalculator calculator = new CarCalculator();
        calculator.setVehicle(vehicle);

        System.out.printf("Vehicle price (USD): %s\n", calculator.calculatePrice());

        Adapter adapter = new Adapter(20.0f,0.027f);
        Auto auto = new Auto(5, "Audi", false, 100_000);

        System.out.printf("Vehicle price (UAH): %f\n", adapter.vehiclePrice(auto));
        System.out.printf("Customs tax: %f\n", adapter.tax(auto));
    }
}