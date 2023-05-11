package homework7.task_3_2;

import com.vehiclecalculator.*;
import homework7.task_3_2.UACustoms.Auto;
import homework7.task_3_2.UACustoms.Customs;


public class Adapter implements Customs{

    float taxRate;
    float UsdToUahRate;

    public Adapter(float taxRate, float UsdToUahRate) {
        this.taxRate = taxRate;
        this.UsdToUahRate = UsdToUahRate;
    }

    @Override
    public float vehiclePrice(Auto auto) {
        Vehicle vehicle;
        VehicleCalculator vehicleCalculator;

        if (auto.model.equals("truck")){
            vehicle = new Truck(auto.age, auto.mileage);
            vehicleCalculator = new TruckCalculator();
        }
        else {
            float damaged = auto.damaged ? 0.75f : 0.25f;

            vehicle = new Car(auto.age, auto.model, damaged);
            vehicleCalculator = new CarCalculator();
        }

        vehicleCalculator.setVehicle(vehicle);
        String priceInUsdFormatted = vehicleCalculator.calculatePrice();
        float priceInUsd = Float.parseFloat(priceInUsdFormatted.replace("USD", ""));
        return priceInUsd * UsdToUahRate;
    }

    @Override
    public float tax(Auto auto) {
        return vehiclePrice(auto) * taxRate;
    }
}
