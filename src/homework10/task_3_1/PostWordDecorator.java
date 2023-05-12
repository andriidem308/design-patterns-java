package homework10.task_3_1;


public class PostWordDecorator extends Decorator {
    private final String word;

    public PostWordDecorator(Unit unit, String word) {
        super(unit);
        this.word = word;
    }

    @Override
    public void print() {
        super.print();
        System.out.print(word);
    }
}
