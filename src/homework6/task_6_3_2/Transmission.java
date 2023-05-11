package homework6.task_6_3_2;


public class Transmission {
    private final TransmissionType transmissionType;
    private final int gearsNumber;

    public Transmission(TransmissionType transmissionType, int gearsNumber) {
        this.transmissionType = transmissionType;
        this.gearsNumber = gearsNumber;
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
}
