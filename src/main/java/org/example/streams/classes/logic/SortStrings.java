package org.example.streams.classes.logic;

import java.util.List;
import java.util.stream.Collectors;

public class SortStrings {
    public List<String> process(List<String> words) {
        return words.stream().sorted().collect(Collectors.toList());
    }
}
