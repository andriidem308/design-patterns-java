package homework8.task_3_1;


public abstract class Beverage {

    protected final int sugar;
    protected final Additive additive;
    protected final OrderType orderType;


    public Beverage(int sugar, Additive additive, OrderType orderType) {
        this.sugar = sugar;
        this.additive = additive;
        this.orderType = orderType;
    }

    public abstract void prepare();
    public abstract void drink();
    public abstract int cost();
}
