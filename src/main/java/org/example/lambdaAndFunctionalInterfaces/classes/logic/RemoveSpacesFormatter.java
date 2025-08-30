package org.example.lambdaAndFunctionalInterfaces.classes.logic;

import org.example.lambdaAndFunctionalInterfaces.interfaces.StringFormatter;

import java.util.Arrays;

public class RemoveSpacesFormatter implements StringFormatter {
    @Override
    public String format(String s) {
        return Arrays.stream(s.split(" ")).reduce("",String::concat);
    }
}
