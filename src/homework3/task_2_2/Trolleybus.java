package homework3.task_2_2;

public interface Trolleybus extends Car {
    @Override
    Long getVehicleCost();
    @Override
    Long getDistanceCost(Long distance);
}
