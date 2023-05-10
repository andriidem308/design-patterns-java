package homework5.task_3_1;

import java.util.ArrayList;

public class EquationsPrototypeClient {
    public void execute() {

        ArrayList<Integer> coeffs_1 = new ArrayList<>();
        coeffs_1.add(2);
        coeffs_1.add(5);
        Equation equation_1 = new Equation(coeffs_1);

        ArrayList<Integer> coeffs_2 = new ArrayList<>();
        coeffs_2.add(2);
        coeffs_2.add(5);
        coeffs_2.add(1);
        QuadraticEquation equation_2 = new QuadraticEquation(coeffs_2);

        ArrayList<Integer> coeffs_3 = new ArrayList<>();
        coeffs_3.add(1);
        coeffs_3.add(0);
        coeffs_3.add(-10);
        coeffs_3.add(0);
        coeffs_3.add(9);
        BiQuadraticEquation equation_3 = new BiQuadraticEquation(coeffs_3);

        System.out.println("Equation 1: " + equation_1);
        System.out.println("Equation 2: " + equation_2);
        System.out.println("Equation 3: " + equation_3);

        Equation equation_clone_1 = equation_1.clone();
        Equation equation_clone_2 = equation_2.clone();
        Equation equation_clone_3 = equation_3.clone();

        System.out.println("Equation 1 Clone: " + equation_clone_1);
        System.out.println("Equation 2 Clone: " + equation_clone_2);
        System.out.println("Equation 3 Clone: " + equation_clone_3);

        System.out.println("Equation 1 Solution: " + equation_1.solve());
        System.out.println("Equation 1 Clone Solution: " + equation_clone_1.solve());
        System.out.println("Equation 2 Solution: " + equation_2.solve());
        System.out.println("Equation 2 Clone Solution: " + equation_clone_2.solve());
        System.out.println("Equation 3 Solution: " + equation_3.solve());
        System.out.println("Equation 3 Clone Solution: " + equation_clone_3.solve());
    }
}
