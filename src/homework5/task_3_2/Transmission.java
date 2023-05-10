package homework5.task_3_2;


public class Transmission implements Cloneable {
    private final TransmissionType transmissionType;
    private final int gearsNumber;

    public Transmission(TransmissionType transmissionType, int gearsNumber) {
        this.transmissionType = transmissionType;
        this.gearsNumber = gearsNumber;
    }

    public Transmission(Transmission other) {
        this.transmissionType = other.transmissionType;
        this.gearsNumber = other.gearsNumber;
    }

    public TransmissionType getTransmissionType() {
        return transmissionType;
    }

    public int getGearsNumber() {
        return gearsNumber;
    }

    @Override
    public String toString() {
        String result = "";
        result += "\n";
        result += "- Transmission Type: " + getTransmissionType() + "\n";
        result += "- Gears Number: " + getGearsNumber();
        return result;
    }

    @Override
    public Transmission clone() {
        return new Transmission(this);
    }
}
