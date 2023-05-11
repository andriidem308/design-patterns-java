package homework6.task_4_3_1;


public class RubberBuilder {
    private double hardness;
    private double elasticity;

    public void setHardness(double hardness) {
        this.hardness = hardness;
    }

    public void setElasticity(double elasticity) {
        this.elasticity = elasticity;
    }

    public Rubber build() {
        return new Rubber(hardness, elasticity);
    }
}
