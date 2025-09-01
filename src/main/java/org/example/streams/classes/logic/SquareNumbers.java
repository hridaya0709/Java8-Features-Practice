package org.example.streams.classes.logic;

import java.util.List;
import java.util.stream.Collectors;

public class SquareNumbers {
    public List<Integer> process(List<Integer> nums) {
        return nums.stream().map(i -> i*i).collect(Collectors.toList());
    }
}
