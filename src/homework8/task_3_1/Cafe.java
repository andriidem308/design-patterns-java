package homework8.task_3_1;


public class Cafe {

    public static void main(String[] args) {
        Chocolate blackChocolate = new Chocolate(3, new HotWater(200), new EatInOrder());
        Coffee blackCoffee = new Coffee(3, new HotWater(200), new TakeawayOrder(), true);
        Tea blackTea = new Tea(0, new HotWater(300), new EatInOrder());

        beverageInfo(blackChocolate);
        beverageInfo(blackCoffee);
        beverageInfo(blackTea);

        Chocolate milkChocolate = new Chocolate(3, new Milk(200), new TakeawayOrder());
        Coffee coffeeWithMilk = new Coffee(3, new Milk(200), new EatInOrder(), false);
        Tea teaWithMilk = new Tea(2, new Milk(300), new TakeawayOrder());

        beverageInfo(milkChocolate);
        beverageInfo(coffeeWithMilk);
        beverageInfo(teaWithMilk);
    }

    private static void beverageInfo(Beverage beverage) {

        System.out.println("=========================");

        beverage.prepare();
        System.out.printf("Cost of beverage: %s grn\n",  beverage.cost());
        beverage.drink();
    }

}
