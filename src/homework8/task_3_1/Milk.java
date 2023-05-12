package homework8.task_3_1;

public class Milk implements Additive {
    private final int volume;

    public Milk(int volume) {
        this.volume = volume;
    }

    @Override
    public String getAdditive() {
        return "milk";
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public int cost() {
        return (int) (volume / 20.0);
    }
}
