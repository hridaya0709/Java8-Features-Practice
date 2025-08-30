package org.example.lambdaAndFunctionalInterfaces.classes.logic;

import java.util.function.Consumer;

public class PrintWordCountsInSentences {
    public Consumer<Integer> print = x -> System.out.println(x);
}
