package homework10.task_3_1;


public abstract class Decorator implements Unit {
    private final Unit wrapper;

    public Decorator(Unit unit) {
        this.wrapper = unit;
    }

    @Override
    public void print() {
        wrapper.print();
    }
}
