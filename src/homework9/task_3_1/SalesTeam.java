package homework9.task_3_1;

import java.util.ArrayList;


public class SalesTeam implements Employee {
    private final ArrayList<Employee> employees = new ArrayList<>();

    void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void payExpenses() {
        for (Employee employee : employees) {
            employee.payExpenses();
        }
    }
}
