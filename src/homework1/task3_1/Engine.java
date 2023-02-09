package homework1.task3_1;

public class Engine {
    private int power;
    private double volume;

    public Engine(int power, double volume) {
        this.power = power;
        this.volume = volume;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getEngineInfo() {
        return "(Engine)\nPower: " + getPower() + " horsepower\nVolume: " + getVolume();
    }
}
