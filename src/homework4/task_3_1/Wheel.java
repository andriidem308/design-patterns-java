package homework4.task_3_1;

public class Wheel {
    private final WheelsMaterialType materialType;
    private final double diameter;

    public Wheel(WheelsMaterialType materialType, double diameter) {
        this.materialType = materialType;
        this.diameter = diameter;
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
}
