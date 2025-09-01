package org.example.lambdaAndFunctionalInterfaces.classes.logic;

import org.example.Java8;

import java.util.List;
import java.util.stream.Collectors;

import static org.example.Java8.print;

public class ProcessUsers {

    public List<String> getFilteredUsers(List<String> users, String ch) {

        return users.stream()
                .filter(s -> s.startsWith(ch))
                .collect(Collectors.toList());
    }
}
