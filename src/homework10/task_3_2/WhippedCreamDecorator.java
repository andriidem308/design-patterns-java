package homework10.task_3_2;


public class WhippedCreamDecorator extends Decorator {
    public WhippedCreamDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String description() {
        return String.format("%s, whipped cream", wrapper.description());
    }

    @Override
    public float cost() {
        return 0.3f + wrapper.cost();
    }
}
