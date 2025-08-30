package org.example.lambdaAndFunctionalInterfaces.interfaces;

//Create a custom functional interface MathOperation with method int operate(int a, int b).
//
//Implement addition, subtraction, multiplication, division using lambdas.
@FunctionalInterface
public interface MathOperation {
    public int operate(int a, int b);
}
