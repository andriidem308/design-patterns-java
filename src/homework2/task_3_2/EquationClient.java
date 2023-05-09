package homework2.task_3_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EquationClient {

    public void solve() {
        solver("src/homework2/task_3_2/input0.txt");
        solver("src/homework2/task_3_2/input1.txt");
        solver("src/homework2/task_3_2/input2.txt");
    }

    private void solver(String nameOfFile) {
        ArrayList<ArrayList<Integer>> input = fileReader(nameOfFile);
        ArrayList<EquationResult> resultsOfEquations = new ArrayList<>();

        for (ArrayList<Integer> item : input) {
            if (item.size() == 2) {
                Equation linearEquation = new Equation(item);
                resultsOfEquations.add(linearEquation.solve());
            } else if (item.size() == 3) {
                QuadraticEquation quadraticEquation = new QuadraticEquation(item);
                resultsOfEquations.add(quadraticEquation.solve());
            } else {
                BiQuadraticEquation biQuadraticEquation = new BiQuadraticEquation(item);
                resultsOfEquations.add(biQuadraticEquation.solve());
            }
        }

        showDifferentTypesOfEquation(resultsOfEquations, input);
    }

    private void showDifferentTypesOfEquation(ArrayList<EquationResult> resultsOfEquations, ArrayList<ArrayList<Integer>> itemsOfOdds) {
        for (EquationResult result : resultsOfEquations) {
            if (result instanceof NoneEquationResult) {
                ArrayList<Integer> value = itemsOfOdds.get(resultsOfEquations.indexOf(result));
                System.out.printf("There is no solution for this equation: %s%n", value);
            } else if (result instanceof OneEquationResult) {
                ArrayList<Integer> value = itemsOfOdds.get(resultsOfEquations.indexOf(result));
                System.out.printf("There is 1 solution for this equation: %s%n", value);
            } else {
                if (result instanceof MoreThanOneEquationResult moreThanOneEquationResult) {
                    if (moreThanOneEquationResult.value.size() == 2) {
                        ArrayList<Integer> value = itemsOfOdds.get(resultsOfEquations.indexOf(result));
                        System.out.printf("There are 2 solutions for this equation: %s%n", value);
                    } else if (moreThanOneEquationResult.value.size() == 3) {
                        ArrayList<Integer> value = itemsOfOdds.get(resultsOfEquations.indexOf(result));
                        System.out.printf("There are 3 solutions for this equation: %s%n", value);
                    } else if (moreThanOneEquationResult.value.size() == 4) {
                        ArrayList<Integer> value = itemsOfOdds.get(resultsOfEquations.indexOf(result));
                        System.out.printf("There are 4 solutions for this equation: %s%n", value);
                    } else {
                        ArrayList<Integer> value = itemsOfOdds.get(resultsOfEquations.indexOf(result));
                        System.out.printf("There is infinite number of solutions for this equation: %s%n", value);
                    }
                }
            }
        }
    }

    private ArrayList<ArrayList<Integer>> fileReader(String nameOfFile) {
        ArrayList<ArrayList<Integer>> resultItemsForValidation = new ArrayList<>();
        try {
            File file = new File(nameOfFile);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                resultItemsForValidation.add(parseLineIntoNumbers(line));
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return resultItemsForValidation;
    }

    private ArrayList<Integer> parseLineIntoNumbers(String line) {
        String clearLine = line.trim().replaceAll(" +", " ");
        List<String> stringNumbersList = List.of(clearLine.split(" "));
        return stringNumbersToInteger(stringNumbersList);
    }

    private ArrayList<Integer> stringNumbersToInteger(List<String> stringNumbers) {
        ArrayList<Integer> integerNumbers = new ArrayList<>();
        for (String item : stringNumbers) {
            integerNumbers.add(Integer.valueOf(item));
        }
        return integerNumbers;
    }

}
