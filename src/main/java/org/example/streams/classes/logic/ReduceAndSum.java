package org.example.streams.classes.logic;

import java.util.List;

public class ReduceAndSum {
    public int process(List<Integer> nums) {

//        return nums.stream()
//                .reduce(0, Integer::sum);

        // faster than reduce
        return nums.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
}
