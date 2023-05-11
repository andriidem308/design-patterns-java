package homework6.task_6_3_2;


public class TransmissionBuilder {
    private TransmissionType transmissionType;
    private int gearsNumber;

    public void setTransmissionType(TransmissionType transmissionType) {
        this.transmissionType = transmissionType;
    }

    public void setGearsNumber(int gearsNumber) {
        this.gearsNumber = gearsNumber;
    }

    public Transmission build() {
        return new Transmission(transmissionType, gearsNumber);
    }
}
