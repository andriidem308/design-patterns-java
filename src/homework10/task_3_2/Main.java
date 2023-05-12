package homework10.task_3_2;


public class Main {

    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        espresso = new MilkDecorator(espresso);
        espresso = new CreamDecorator(espresso);
        espresso = new SugarDecorator(espresso);
        espresso = new SugarDecorator(espresso);
        System.out.println(espresso);

        Beverage darkRoast = new DarkRoast();
        darkRoast = new CreamDecorator(darkRoast);
        darkRoast = new WhippedCreamDecorator(darkRoast);
        darkRoast = new MilkDecorator(darkRoast);
        darkRoast = new SugarDecorator(darkRoast);
        System.out.println(darkRoast);

        Beverage decaf = new Decaf();
        decaf = new WhippedCreamDecorator(decaf);
        decaf = new SugarDecorator(decaf);
        System.out.println(decaf);
    }
}
