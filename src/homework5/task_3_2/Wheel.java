package homework5.task_3_2;

public class Wheel implements Cloneable {
    private final WheelsMaterialType materialType;
    private final double diameter;

    public Wheel(WheelsMaterialType materialType, double diameter) {
        this.materialType = materialType;
        this.diameter = diameter;
    }

    public Wheel(Wheel other) {
        this.materialType = other.materialType;
        this.diameter = other.diameter;
    }

    public WheelsMaterialType getMaterialType() {
        return materialType;
    }

    public double getDiameter() {
        return diameter;
    }

    @Override
    public String toString() {
        String result = "";
        result += "\n";
        result += "- Material Type: " + getMaterialType() + "\n";
        result += "- Diameter: " + getDiameter();
        return result;
    }

    @Override
    public Wheel clone() {
        return new Wheel(this);
    }
}
