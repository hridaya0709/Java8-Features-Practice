package org.example.lambdaAndFunctionalInterfaces.classes.logic;

import org.example.lambdaAndFunctionalInterfaces.classes.model.Employee;

import java.util.function.Predicate;

public class CheckEmployeeAge {
    public Predicate<Employee> checkAgeGreaterThan30 = e -> e.getAge()>30;
}
