package homework2.task_3_2;

public class DiscriminantSolver {

    public TypeOfDiscriminant calculateDiscriminant(Integer a, Integer b, Integer c) {
        double discriminantValue = Math.pow(b, 2) - 4 * (a * c);
        if (discriminantValue > 0.0) {
            return new DiscriminantGreaterThanZero(b, a, discriminantValue);
        } else if (discriminantValue == 0.0) {
            if (a == 0) {
                return new DiscriminantLessThanZero();
            } else {
                return new DiscriminantIsZero(b, a);
            }
        } else {
            return new DiscriminantLessThanZero();
        }
    }

}
