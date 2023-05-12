package homework10.task_3_1;


public class PrintableString implements Unit {
    private final String base;

    public PrintableString(String base) {
        this.base = base;
    }

    @Override
    public void print() {
        System.out.print(base);
    }
}
