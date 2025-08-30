package org.example.lambdaAndFunctionalInterfaces.classes.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class WordsCounter {
    public List<Integer> countWords(List<String> sentences) {
        return sentences.stream().map(counter).toList();
    }

    Function<String, Integer> counter = s -> {
        String[] sArr = s.split("\\s+");
        return sArr.length;
    };

}
