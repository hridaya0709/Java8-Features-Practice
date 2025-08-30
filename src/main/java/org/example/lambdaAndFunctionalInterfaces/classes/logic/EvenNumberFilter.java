package org.example.lambdaAndFunctionalInterfaces.classes.logic;

import java.util.List;

public class EvenNumberFilter {
    public void getEvenNumbers(List<Integer> nums) {
        nums.stream()
                .filter(i -> i % 2 == 0)
                .map(i -> i * i)
                .forEach(System.out::println);
    }
}
