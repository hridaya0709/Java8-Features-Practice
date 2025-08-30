package org.example.lambdaAndFunctionalInterfaces.classes.logic;

import org.example.lambdaAndFunctionalInterfaces.classes.model.Employee;

import java.util.function.Predicate;

public class CheckEmployeeSalary {
    public Predicate<Employee> checkSalaryGreaterThan50T = e -> e.getSalary()>50000;
}
