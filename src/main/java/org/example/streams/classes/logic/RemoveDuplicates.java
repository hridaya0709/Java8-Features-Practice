package org.example.streams.classes.logic;

import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public List<Integer> process(List<Integer> nums) {
        return nums.stream().distinct().collect(Collectors.toList());
    }
}
