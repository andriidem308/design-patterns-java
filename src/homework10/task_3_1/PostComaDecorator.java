package homework10.task_3_1;


public class PostComaDecorator extends Decorator {
    public PostComaDecorator(Unit unit) {
        super(unit);
    }

    @Override
    public void print() {
        super.print();
        System.out.print(",");
    }
}
