package homework10.task_3_2;


public class SugarDecorator extends Decorator {
    public SugarDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String description() {
        return String.format("%s, sugar", wrapper.description());
    }

    @Override
    public float cost() {
        return 0.2f + wrapper.cost();
    }
}
