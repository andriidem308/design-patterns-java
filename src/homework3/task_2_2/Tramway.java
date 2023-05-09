package homework3.task_2_2;

public interface Tramway extends Car {
    @Override
    Long getVehicleCost();
    Long getDistanceCost(Long distance);
}
