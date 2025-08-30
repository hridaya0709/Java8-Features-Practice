package org.example.lambdaAndFunctionalInterfaces.classes;
//Create a list of strings and sort them by length using a lambda-based Comparator.
//Then sort them in reverse alphabetical order.

import java.util.List;

public class StringComparator {
    public void processStr(List<String> str) {
        str.stream()
                .sorted(java.util.Comparator.comparingInt(String::length))
                .sorted(java.util.Comparator.reverseOrder())
                .forEach(s -> System.out.println(s));

    }
}
