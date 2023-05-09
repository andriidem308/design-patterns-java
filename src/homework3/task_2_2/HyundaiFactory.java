package homework3.task_2_2;

public class HyundaiFactory implements CarFactory{

    @Override
    public Bus createBus() {
        return new HyundaiBus(5500000L, 20);
    }

    @Override
    public Tramway createTramway() {
        return new HyundaiTramway(9500000L, 6);
    }

    @Override
    public Trolleybus createTrolleybus() {
        return new HyundaiTrolleybus(7000000L, 11);
    }
}
