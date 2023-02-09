package homework1.task3_1;

public class Wheel {
    private int size;

    public Wheel(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getWheelInfo() {
        return "(Wheel)\nSize: " + getSize();
    }
}
