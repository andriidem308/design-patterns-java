package homework5.task_3_2;


public class Rubber implements Cloneable {
    private final double elasticity;
    private final double hardness;

    public Rubber(double elasticity, double hardness) {
        this.elasticity = elasticity;
        this.hardness = hardness;
    }

    public Rubber(Rubber other) {
        this.elasticity = other.elasticity;
        this.hardness = other.hardness;
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

    @Override
    public Rubber clone() {
        return new Rubber(this);
    }
}
