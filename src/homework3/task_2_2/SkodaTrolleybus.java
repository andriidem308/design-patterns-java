package homework3.task_2_2;

public class SkodaTrolleybus implements Trolleybus {
    private final Long vehicleCost;
    private final Integer costPerKilometer;

    SkodaTrolleybus(Long vehicleCost, Integer costPerKilometer) {
        this.vehicleCost = vehicleCost;
        this.costPerKilometer = costPerKilometer;
    }

    @Override
    public Long getVehicleCost() {
        return vehicleCost;
    }

    @Override
    public Long getDistanceCost(Long distance) {
        return distance * costPerKilometer;
    }
}
