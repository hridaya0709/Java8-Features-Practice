package org.example.lambdaAndFunctionalInterfaces.classes.data;

import org.example.lambdaAndFunctionalInterfaces.classes.model.Employee;

import java.util.Arrays;
import java.util.List;

public class EmployeeData {
    Employee emp1 = new Employee("Jack", 40, 45000);
    Employee emp2 = new Employee("Jill", 29, 60000);
    Employee emp3 = new Employee("John", 55, 51000);

    public List<Employee> getEmployees() {
        return Arrays.asList(emp1, emp2, emp3);
    }

}
