package homework10.task_3_1;


public class PostEndlDecorator extends Decorator {
    public PostEndlDecorator(Unit unit) {
        super(unit);
    }

    @Override
    public void print() {
        super.print();
        System.out.print("\n");
    }
}
