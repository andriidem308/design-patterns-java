package homework10.task_3_1;


public class PostSpaceDecorator extends Decorator {
    public PostSpaceDecorator(Unit unit) {
        super(unit);
    }

    @Override
    public void print() {
        super.print();
        System.out.print(" ");
    }
}
