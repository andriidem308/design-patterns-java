package homework14.task_3_3;


public abstract class AbstractOperation {
    protected AbstractOperation nextOperation;

    public void setNextOperation(AbstractOperation nextOperation) {
        this.nextOperation = nextOperation;
    }

    public abstract double calculate(double x, double y, String operation);
}