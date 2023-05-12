package homework8.task_3_1;


public class Coffee extends Beverage {
    final private boolean extra_coffee;

    public Coffee(int sugar, Additive additive, OrderType orderType, boolean extra_coffee) {
        super(sugar, additive, orderType);
        this.extra_coffee = extra_coffee;
    }

    @Override
    public void prepare() {
        System.out.println("Put some coffee...");
        if (extra_coffee) System.out.println("Put extra coffee...");
        System.out.printf("Put some %s: %s ml%n", additive.getAdditive(), additive.getVolume());
        if (sugar > 0) System.out.printf("Put some sugar: %s pieces ...%n", sugar);
    }

    @Override
    public int cost() {
        int additiveCost = additive.cost();
        return 10 + additiveCost;
    }

    @Override
    public void drink() {
        String drinkingLogging = "Drink coffee";

        String additiveType = additive.getAdditive();
        if (!additiveType.equals("water")) {
            drinkingLogging += " with " + additiveType;
        }
        drinkingLogging += ", ordered <" + orderType.getOrderType() + ">";

        System.out.println(drinkingLogging);
    }
}
