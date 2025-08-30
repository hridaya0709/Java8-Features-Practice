package org.example.lambdaAndFunctionalInterfaces.classes.logic;

//Write a program using Predicate<String> to check:
//
//if a string is non-empty
//
//if it starts with "A".
//
//Combine them with and() and or() to test different strings.

import java.util.function.Predicate;

public class CheckStringPredicate {
    public void checkString(String st) {
        Predicate<String> isEmptyAndStartsWithA = s -> {
            if(!s.isEmpty()){
                return s.startsWith("A");
            }
            return false;
        };

        System.out.println(isEmptyAndStartsWithA.test(st));
        System.out.println(isEmptyAndStartsWithA.and(s -> s.equals("home")).test(st));
        System.out.println(isEmptyAndStartsWithA.or(s -> s.length()<6).test(st));

    }
}
