package homework10.task_3_2;


public class MilkDecorator extends Decorator {
    public MilkDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String description() {
        return String.format("%s, milk", wrapper.description());
    }

    @Override
    public float cost() {
        return 0.3f + wrapper.cost();
    }
}
