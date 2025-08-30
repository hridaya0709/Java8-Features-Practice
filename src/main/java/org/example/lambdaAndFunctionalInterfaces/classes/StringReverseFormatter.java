package org.example.lambdaAndFunctionalInterfaces.classes;

import org.example.lambdaAndFunctionalInterfaces.interfaces.StringFormatter;

public class StringReverseFormatter implements StringFormatter {
    @Override
    public String format(String s) {
        String s2 = "";
        for(int i=s.length()-1; i>=0; i--) {
            char ch = s.charAt(i);
            s2 = s2 + ch;
        }
        return s2;
    }
}
