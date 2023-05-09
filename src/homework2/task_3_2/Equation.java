package homework2.task_3_2;

import java.util.List;

public class Equation {

    private final List<Integer> odds;

    Equation(List<Integer> odds) {
        this.odds = odds;
    }

    EquationResult solve() {
        Integer b = odds.get(0);
        Integer c = odds.get(1);
        Float value = ((float) -c) / b;
        return new OneEquationResult(value);
    }
}
