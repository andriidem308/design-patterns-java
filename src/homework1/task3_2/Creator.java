package homework1.task3_2;

public class Creator {
    protected Product createProduct() {
        if (Math.random() < 0.5) {
            return new Product1();
        } else {
            return new Product2();
        }
    }

    protected void someOperation() {
        Product product = createProduct();
        product.doSomething();
    }
}
