package org.example.lambdaAndFunctionalInterfaces.interfaces;

//Define @FunctionalInterface interface StringFormatter { String format(String s); }.
//Implement:
//to uppercase
//reverse string
//remove spaces

@FunctionalInterface
public interface StringFormatter {
    String format(String s);
}
