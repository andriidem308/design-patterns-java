package homework16.task_3_1;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class StaffListIterator implements Iterator<Employee> {
    private final List<Employee> employees;
    private int currentEmployeeIndex;

    public StaffListIterator(List<Employee> employees) {
        this.employees = employees;
        this.employees.sort(Comparator.comparing(Employee::getName));
        this.currentEmployeeIndex = 0;
    }
    @Override
    public boolean hasNext() {
        return currentEmployeeIndex < employees.size();
    }

    @Override
    public Employee next() {
        Employee currentEmployee = employees.get(currentEmployeeIndex);
        currentEmployeeIndex += 1;
        return currentEmployee;
    }
}
