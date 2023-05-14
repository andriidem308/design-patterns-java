package homework14.task_3_3;

public class Client {

    public static void main(String[] args) {
        AbstractOperation addOperation = new AddOperation();
        AbstractOperation divideOperation = new DivideOperation();
        AbstractOperation multiplyOperation = new MultiplyOperation();
        AbstractOperation subtractOperation = new SubtractOperation();

        addOperation.setNextOperation(divideOperation);
        divideOperation.setNextOperation(multiplyOperation);
        multiplyOperation.setNextOperation(subtractOperation);

        printProblem(2.14, 3, "+", addOperation);
        printProblem(7.5, 1, "-", addOperation);
        printProblem(6, 9, "*", addOperation);
        printProblem(18, 4, "/", addOperation);
        printProblem(2, 5, "/", addOperation);
        printProblem(12.3, 35.8, "+", addOperation);
    }

    public static void printProblem(double x, double y, String operation, AbstractOperation calculator) {
        System.out.printf("%f %s %f = %f\n", x, operation, y, calculator.calculate(x, y, operation));
    }

}
