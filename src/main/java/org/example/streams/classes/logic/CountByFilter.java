package org.example.streams.classes.logic;

import java.util.List;

public class CountByFilter {
    public long process(List<String> names, String ch) {
        return names.stream().filter(s -> s.toLowerCase().startsWith(ch.toLowerCase()))
                //.peek(System.out::println)
                .count();
    }
}
