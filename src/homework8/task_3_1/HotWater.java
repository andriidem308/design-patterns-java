package homework8.task_3_1;

public class HotWater implements Additive {
    private final int volume;

    public HotWater(int volume) {
        this.volume = volume;
    }

    @Override
    public String getAdditive() {
        return "hot water";
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public int cost() {
        return 0;
    }
}
