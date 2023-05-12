package homework10.task_3_2;

public class CreamDecorator extends Decorator{
    public CreamDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String description() {
        return String.format("%s, cream", wrapper.description());
    }

    @Override
    public float cost() {
        return 0.4f + wrapper.cost();
    }
}
