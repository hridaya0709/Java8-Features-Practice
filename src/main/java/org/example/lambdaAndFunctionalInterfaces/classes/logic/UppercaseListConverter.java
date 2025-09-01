package org.example.lambdaAndFunctionalInterfaces.classes.logic;

import java.util.List;
import java.util.stream.Collectors;

public class UppercaseListConverter {
    public List<String> convert(List<String> names) {
        return names.stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());
    }
}
