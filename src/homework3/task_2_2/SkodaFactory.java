package homework3.task_2_2;

public class SkodaFactory implements CarFactory {

    @Override
    public Bus createBus() {
        return new SkodaBus(4500000L, 20);
    }

    @Override
    public Tramway createTramway() {
        return new SkodaTramway(9000000L, 8);
    }

    @Override
    public Trolleybus createTrolleybus() {
        return new SkodaTrolleybus(6800000L, 12);
    }
}
