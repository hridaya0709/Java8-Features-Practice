package org.example.lambdaAndFunctionalInterfaces.classes;

import java.util.function.Function;

//Function<String, String> → convert string to uppercase.
//
//Function<String, String> → add "!!!" at the end.
public class StringConcatenationFunction {
    public String getmodifiedString(String st) {
        Function<String, String> convertStrToUC = s -> s.toUpperCase();
        Function<String, String> appendExclamation = s -> s.concat("!!!");

        st = convertStrToUC.apply(st);
        st = appendExclamation.apply(st);

        return st;
    }
}
