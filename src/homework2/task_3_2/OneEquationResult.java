package homework2.task_3_2;

public class OneEquationResult implements EquationResult {
    Float value;

    public OneEquationResult(Float value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value.toString();
    }
}
