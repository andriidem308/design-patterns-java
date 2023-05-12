package homework10.task_3_2;


public abstract class Decorator extends Beverage {
    protected final Beverage wrapper;

    protected Decorator(Beverage beverage) {
        this.wrapper = beverage;
    }
}
