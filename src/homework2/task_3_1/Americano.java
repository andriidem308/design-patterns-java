package homework2.task_3_1;

public class Americano implements Drink {
    private final Integer cost;
    private Integer price;

    Americano(Integer cost) {
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

