package homework4.task_3_2;


public class WheelBuilder  {
    private WheelsMaterialType materialType;
    private double diameter;

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public void setMaterialType(WheelsMaterialType materialType) {
        this.materialType = materialType;
    }

    public Wheel build() {
        return new Wheel(materialType, diameter);
    }
}
