package org.example.lambdaAndFunctionalInterfaces.classes.logic;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//Write a Consumer<String> that prints a string in uppercase.
//Use it with forEach() on a list of names.
public class UpperCaseStringConsumer {
    public void convertStringToUpperCase() {
        Consumer<String> convertStringToUC = s -> System.out.println(s.toUpperCase());
        List<String> names = Arrays.asList("jungkook", "jimin", "taehyung");

        for(String name : names) {
            convertStringToUC.accept(name);
        }
    }
}
