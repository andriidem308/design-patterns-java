package homework5.task_3_1;

import homework2.task_3_2.EquationResult;
import homework2.task_3_2.OneEquationResult;

import java.util.List;

public class Equation implements Cloneable {

    private final List<Integer> odds;

    Equation(List<Integer> odds) {
        this.odds = odds;
    }

    Equation(Equation other) {
        this.odds = other.odds;
    }

    EquationResult solve() {
        Integer b = odds.get(0);
        Integer c = odds.get(1);
        Float value = ((float) -c) / b;
        return new OneEquationResult(value);
    }

    @Override
    public Equation clone() {
        return new Equation(this);
    }

    @Override
    public String toString() {
        return odds.toString();
    }
}
