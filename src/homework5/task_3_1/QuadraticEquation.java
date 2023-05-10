package homework5.task_3_1;

import homework2.task_3_2.*;

import java.util.List;

public class QuadraticEquation extends Equation {

    private final DiscriminantSolver discriminantSolver = new DiscriminantSolver();
    private final List<Integer> odds;

    QuadraticEquation(List<Integer> odds) {
        super(odds);
        this.odds = odds;
    }

    QuadraticEquation(QuadraticEquation other) {
        super(other);
        this.odds = other.odds;
    }

    @Override
    EquationResult solve() {

        Integer a = odds.get(0);
        Integer b = odds.get(1);
        Integer c = odds.get(2);

        TypeOfDiscriminant discriminant = discriminantSolver.calculateDiscriminant(a, b, c);

        if (discriminant instanceof DiscriminantGreaterThanZero) {
            return new MoreThanOneEquationResult(((DiscriminantGreaterThanZero) discriminant).getResult());
        } else if (discriminant instanceof DiscriminantIsZero) {
            return new OneEquationResult(((DiscriminantIsZero) discriminant).getResult());
        } else {
            return new NoneEquationResult();
        }
    }

    @Override
    public Equation clone() {
        return new QuadraticEquation(this);
    }
}


