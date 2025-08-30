package org.example.lambdaAndFunctionalInterfaces.classes;

import org.example.lambdaAndFunctionalInterfaces.interfaces.StringFormatter;

public class UppercaseFormatter implements StringFormatter {
    @Override
    public String format(String s) {
        return s.toUpperCase();
    }
}
