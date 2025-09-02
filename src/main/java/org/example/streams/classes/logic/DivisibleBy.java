package org.example.streams.classes.logic;

import java.util.List;
import java.util.Optional;

public class DivisibleBy {
    public Optional<Integer> check(List<Integer> nums, int n) {
        return nums.stream()
                .filter(i -> i%n==0)
                .findAny();
    }
}
