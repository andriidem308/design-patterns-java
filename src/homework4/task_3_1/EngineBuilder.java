package homework4.task_3_1;


public class EngineBuilder {
    private FuelType fuelType;
    private double power;
    private double torque;
    private double volume;

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public void setTorque(double torque) {
        this.torque = torque;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public Engine build() {
        return new Engine(fuelType, power, torque, volume);
    }
}
