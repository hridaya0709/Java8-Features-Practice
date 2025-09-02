package org.example.streams.classes.logic;

import java.util.List;
import java.util.Optional;

public class FindFromList {

    public Optional<Integer> findFirstNumberGT50(List<Integer> nums) {
        return nums.stream()
                .filter(i -> i>50)
                .findFirst();
    }
}
