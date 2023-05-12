package homework8.task_3_1;


public class Chocolate extends Beverage {
    public Chocolate(int sugar, Additive additive, OrderType orderType) {
        super(sugar, additive, orderType);
    }

    @Override
    public void prepare() {
        System.out.println("Put some cacao...");
        System.out.printf("Put some %s: %s ml%n", additive.getAdditive(), additive.getVolume());
        if (sugar > 0) System.out.printf("Put some sugar: %s pieces ...%n", sugar);
    }

    @Override
    public int cost() {
        int additiveCost = additive.cost();
        return 15 + additiveCost;
    }

    @Override
    public void drink() {
        String drinkingLogging = "Drink chocolate";

        String additiveType = additive.getAdditive();
        if (!additiveType.equals("water")) {
            drinkingLogging += " with " + additiveType;
        }
        drinkingLogging += ", ordered <" + orderType.getOrderType() + ">";

        System.out.println(drinkingLogging);
    }
}
