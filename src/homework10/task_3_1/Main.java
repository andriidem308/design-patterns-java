package homework10.task_3_1;


public class Main {
    public static void main(String[] args) {
        Unit hello = new PrintableString("");
        hello = new PostComaDecorator(hello);
        hello = new PostSpaceDecorator(hello);
        hello = new PreWordDecorator(hello, "Hello");
        hello = new PostWordDecorator(hello, "World");
        hello = new PostExclaimDecorator(hello);
        hello = new PostEndlDecorator(hello);
        hello.print();
    }
}
