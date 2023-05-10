package homework4.task_3_1;


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
