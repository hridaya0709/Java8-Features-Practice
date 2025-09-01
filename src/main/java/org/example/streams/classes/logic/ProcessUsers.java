package org.example.streams.classes.logic;

import java.util.List;
import java.util.stream.Collectors;

public class ProcessUsers {

    public List<String> getFilteredUsers(List<String> users, String ch) {

        return users.stream()
                .filter(s -> s.toLowerCase().startsWith(ch.toLowerCase()))
                .collect(Collectors.toList());
    }
}
