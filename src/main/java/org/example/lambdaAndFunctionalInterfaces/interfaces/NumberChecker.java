package org.example.lambdaAndFunctionalInterfaces.interfaces;

//Create a functional interface NumberChecker with method boolean check(int n).
//
//Implement:
//
//check prime
//check palindrome number
//check Armstrong number
@FunctionalInterface
public interface NumberChecker {
    boolean check(int n);
}
