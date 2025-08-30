package org.example.lambdaAndFunctionalInterfaces.classes.logic;

//Create a Function<String, Integer> that returns the length of a string.
//Apply it to a list of strings and print the lengths.

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class StringLenFunction {
    public void calcLenOfStr(){
        Function<String, Integer> calcLen = s -> s.length();
        List<String> strs = Arrays.asList("Apple", "Ball", "Cat", "Dog");

        for(String s : strs) {
            System.out.println("Length of " + s + " is : " + calcLen.apply(s));
        }

    }

}
