package org.example.streams.classes.logic;

import java.util.List;
import java.util.stream.Collectors;

public class LimitSkip {

    public List<Integer> limit(List<Integer> nums, int x) {
        return nums.stream().limit(x).collect(Collectors.toList());

    }

    public List<Integer> skip(List<Integer> nums, int x) {
        return nums.stream().skip(x).collect(Collectors.toList());
    }
}
