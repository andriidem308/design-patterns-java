package homework7.task_3_1;

public class FastCharge implements TypeCCharger {

    private final float power;

    public FastCharge(float power) {
        this.power = power;
    }

    @Override
    public float getOutputPower() {
        return power;
    }
}
