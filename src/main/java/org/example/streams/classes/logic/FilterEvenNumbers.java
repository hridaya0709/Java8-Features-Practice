package org.example.streams.classes.logic;

import java.util.List;

public class FilterEvenNumbers {
    public void print(List<Integer> nums) {
        nums.stream().filter(i -> i%2==0).forEach(i -> System.out.print(i + " "));
    }

}
