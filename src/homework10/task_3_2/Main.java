package homework10.task_3_2;


public class Main {

    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        espresso = new SugarDecorator(espresso);
        espresso = new SugarDecorator(espresso);
        System.out.println(espresso);

        Beverage darkRoast_1 = new DarkRoast();
        darkRoast_1 = new WhippedCreamDecorator(darkRoast_1);
        darkRoast_1 = new SugarDecorator(darkRoast_1);
        darkRoast_1 = new SugarDecorator(darkRoast_1);
        System.out.println(darkRoast_1);

        Beverage darkRoast_2 = new DarkRoast();
        darkRoast_2 = new CreamDecorator(darkRoast_2);
        darkRoast_2 = new SugarDecorator(darkRoast_2);
        System.out.println(darkRoast_2);

        Beverage decaf = new Decaf();
        decaf = new MilkDecorator(decaf);
        decaf = new SugarDecorator(decaf);
        decaf = new SugarDecorator(decaf);
        System.out.println(decaf);
    }
}
