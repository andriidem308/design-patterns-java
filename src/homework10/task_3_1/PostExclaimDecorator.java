package homework10.task_3_1;


public class PostExclaimDecorator extends Decorator {
    public PostExclaimDecorator(Unit unit) {
        super(unit);
    }

    @Override
    public void print() {
        super.print();
        System.out.print("!");
    }
}
