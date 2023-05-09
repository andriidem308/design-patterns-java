package homework2.task_3_1;

public class CoffeeSection extends StoreSection {
    final Integer ESPRESSO_COST = 8;
    final Integer AMERICANO_COST = 10;
    final Integer CAPPUCCINO_COST = 15;
    final Integer LATTE_COST = 18;
    final Integer FLAT_WHITE_COST = 20;
    final Integer MOCHA_COST = 30;

    @Override
    public Drink createDrink(TypeOfDrink type) {
        Drink result;

        switch (type) {
            case ESPRESSO -> result = new Espresso(ESPRESSO_COST);
            case AMERICANO -> result = new Americano(AMERICANO_COST);
            case CAPPUCCINO -> result = new Cappuccino(CAPPUCCINO_COST);
            case LATTE -> result = new Latte(LATTE_COST);
            case FLAT_WHITE -> result = new FlatWhite(FLAT_WHITE_COST);
            case MOCHA -> result = new Mocha(MOCHA_COST);
            default -> result = null;
        }

        return result;
    }
}