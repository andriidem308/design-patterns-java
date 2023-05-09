package homework2.task_3_1;

public class Espresso implements Drink {
    private final Integer cost;
    private Integer price;

    Espresso(Integer cost) {
        this.cost = cost;
    }

    @Override
    public void calculatePrice(Double margin) {
        Double multiplier = 1 + margin;
        price = (int) Math.ceil(this.cost * multiplier);
    }

    @Override
    public Integer getPrice() {
        return price;
    }

    @Override
    public Integer getCost() {
        return cost;
    }
}
