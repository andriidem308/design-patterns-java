package homework6.task_6_3_2;


public class Rubber {
    private final double elasticity;
    private final double hardness;

    public Rubber(double elasticity, double hardness) {
        this.elasticity = elasticity;
        this.hardness = hardness;
    }

    public double getElasticity() {
        return elasticity;
    }

    public double getHardness() {
        return hardness;
    }

    @Override
    public String toString() {
        String result = "";
        result += "\n";
        result += "- Elasticity: " + getElasticity() + "\n";
        result += "- Hardness: " + getHardness();
        return result;
    }
}
