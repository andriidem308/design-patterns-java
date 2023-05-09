package homework3.task_2_2;


public class VolvoFactory implements CarFactory{
    @Override
    public Bus createBus() {
        return new VolvoBus(6000000L, 20);
    }

    @Override
    public Tramway createTramway() {
        return new VolvoTramway(10000000L, 7);
    }

    @Override
    public Trolleybus createTrolleybus() {
        return new VolvoTrolleybus(7000000L, 13);
    }
}
