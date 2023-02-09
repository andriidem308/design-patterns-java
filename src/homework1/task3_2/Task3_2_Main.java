package homework1.task3_2;

public class Task3_2_Main {
    public static void main(String[] args) {
        Creator creator = new Creator();
        creator.someOperation();

        ConcreteCreator1 concreteCreator1 = new ConcreteCreator1();
        ConcreteCreator2 concreteCreator2 = new ConcreteCreator2();

        concreteCreator1.someOperation();
        concreteCreator2.someOperation();
    }
}
