package org.example.lambdaAndFunctionalInterfaces.classes;

//Write a Supplier<Double> that generates a random number.
//Call get() multiple times to print random numbers.
import java.util.function.Supplier;

public class GenerateRandomNumSupplier {
    public void generateRandomNum() {
        Supplier<Double> generateRandomNum = () -> Math.random();
        System.out.println(generateRandomNum.get());
    }
}
