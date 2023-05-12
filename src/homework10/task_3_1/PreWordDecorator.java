package homework10.task_3_1;


public class PreWordDecorator extends Decorator {
    private final String word;

    public PreWordDecorator(Unit unit, String word) {
        super(unit);
        this.word = word;
    }

    @Override
    public void print() {
        System.out.print(word);
        super.print();
    }
}
