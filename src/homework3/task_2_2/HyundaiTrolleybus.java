package homework3.task_2_2;

public class HyundaiTrolleybus implements Trolleybus {
    private final Long vehicleCost;
    private final Integer costPerKilometer;

    HyundaiTrolleybus(Long vehicleCost, Integer costPerKilometer) {
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
