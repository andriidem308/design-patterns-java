package homework5.task_3_2;

public class Engine implements Cloneable {
    private final FuelType fuelType;
    private final double power;
    private final double volume;
    private final double torque;

    Engine(FuelType fuelType, double power, double torque, double volume) {
        this.fuelType = fuelType;
        this.power = power;
        this.torque = torque;
        this.volume = volume;
    }

    public Engine(Engine other) {
        this.fuelType = other.fuelType;
        this.power = other.power;
        this.torque = other.torque;
        this.volume = other.volume;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public double getPower() {
        return power;
    }

    public double getTorque() {
        return torque;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        String result = "";
        result += "\n";
        result += "- Fuel Type: " + getFuelType() + "\n";
        result += "- Power: " + getPower() + "\n";
        result += "- Torque: " + getTorque() + "\n";
        result += "- Volume: " + getVolume();
        return result;
    }

    @Override
    public Engine clone() {
        return new Engine(this);
    }
}
