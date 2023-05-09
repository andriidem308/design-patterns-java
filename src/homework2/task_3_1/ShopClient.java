package homework2.task_3_1;

import java.util.ArrayList;
import java.util.List;

public class ShopClient {

    public void simulate() {
        final double COFFEE_MARGIN = 0.8;
        final double SWEET_MARGIN = 1.2;

        CoffeeSection coffeeSection = new CoffeeSection();
        SweetSection sweetSection = new SweetSection();

        Drink espresso = coffeeSection.createDrink(TypeOfDrink.ESPRESSO);
        Drink americano = coffeeSection.createDrink(TypeOfDrink.AMERICANO);
        Drink cappuccino = coffeeSection.createDrink(TypeOfDrink.CAPPUCCINO);
        Drink latte = coffeeSection.createDrink(TypeOfDrink.LATTE);
        Drink flatWhite = coffeeSection.createDrink(TypeOfDrink.FLAT_WHITE);
        Drink mocha = coffeeSection.createDrink(TypeOfDrink.MOCHA);


        Drink fanta = sweetSection.createDrink(TypeOfDrink.PEPSI);
        Drink sprite = sweetSection.createDrink(TypeOfDrink.SPRITE);
        Drink cocaCola = sweetSection.createDrink(TypeOfDrink.COCA_COLA);

        List<Drink> coffeeDrinks = new ArrayList<>();
        coffeeDrinks.add(americano);
        coffeeDrinks.add(latte);
        coffeeDrinks.add(espresso);
        coffeeDrinks.add(cappuccino);
        coffeeDrinks.add(flatWhite);
        coffeeDrinks.add(mocha);

        List<Drink> sweetDrinks = new ArrayList<>();
        sweetDrinks.add(fanta);
        sweetDrinks.add(sprite);
        sweetDrinks.add(cocaCola);

        Integer revenueFromCoffeeSection = getRevenueFromOneSection(coffeeSection, coffeeDrinks, COFFEE_MARGIN);
        Integer costFromCoffeeSection = getCostFromOneSection(coffeeSection, coffeeDrinks);
        Integer incomeFromCoffeeSection = getIncome(revenueFromCoffeeSection, costFromCoffeeSection);
        Integer revenueFromSweetSection = getRevenueFromOneSection(sweetSection, sweetDrinks, SWEET_MARGIN);
        Integer costFromSweetSection = getCostFromOneSection(sweetSection, sweetDrinks);
        Integer incomeFromSweetSection = getIncome(revenueFromSweetSection, costFromSweetSection);

        Integer revenueFromDay = revenueFromSweetSection + revenueFromCoffeeSection;
        Integer costFromDay = costFromCoffeeSection + costFromSweetSection;
        Integer incomeFromDay = incomeFromCoffeeSection + incomeFromSweetSection;

        System.out.printf("That day were earned: %s UAH%n", revenueFromDay);
        System.out.printf("That day were spent: %s UAH%n", costFromDay);
        System.out.printf("That day's income: %s UAH%n", incomeFromDay);
    }

    private Integer getRevenueFromOneSection(StoreSection section, List<Drink> drinks, Double margin) {
        for (Drink drink : drinks) {
            drink.calculatePrice(margin);
        }

        return section.calculateAllPrices(drinks);
    }

    private Integer getCostFromOneSection(StoreSection section, List<Drink> drinks) {
        return section.getAllCosts(drinks);
    }

    private Integer getIncome(Integer revenue, Integer cost) {
        return revenue - cost;
    }
}
