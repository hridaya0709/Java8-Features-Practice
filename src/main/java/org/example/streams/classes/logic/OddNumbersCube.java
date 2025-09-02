package org.example.streams.classes.logic;

import java.util.List;
import java.util.stream.Collectors;

public class OddNumbersCube {

    public List<Integer> process(List<Integer> list) {
        return list.stream()
                .filter(i -> i%2 != 0)
                .map(i -> i*i*i)
                .collect(Collectors.toList());
    }

    public List<Integer> peekProcess(List<Integer> list) {
        return list.stream()
                .peek(i -> System.out.println("peek before filter : " + i))
                .filter(i -> i%2 != 0)
                .peek(i -> System.out.println("peek before map (odd numbers) : " + i))
                .map(i -> i*i*i)
                .peek(i -> System.out.println("peek after map (cubed) : " + i))
                .collect(Collectors.toList());
    }
}
