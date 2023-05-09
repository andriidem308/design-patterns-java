package homework2.task_3_1;

public class SweetSection extends StoreSection {
    final Integer COCACOLA_COST = 8;
    final Integer PEPSI_COST = 10;
    final Integer SPRITE_COST = 15;

    @Override
    public Drink createDrink(TypeOfDrink type) {
        Drink result;

        switch (type) {
            case COCA_COLA -> result = new CocaCola(COCACOLA_COST);
            case PEPSI -> result = new Pepsi(PEPSI_COST);
            case SPRITE -> result = new Sprite(SPRITE_COST);
            default -> result = null;
        }

        return result;
    }
}
