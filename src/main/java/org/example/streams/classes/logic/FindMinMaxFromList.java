package org.example.streams.classes.logic;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindMinMaxFromList {
    public Optional<Integer> getMin(List<Integer> list) {
        return list.stream()
                .min(Comparator.naturalOrder());
    }

    public Optional<Integer> getMax(List<Integer> list) {
        return list.stream()
                .max(Comparator.naturalOrder());
    }
}
