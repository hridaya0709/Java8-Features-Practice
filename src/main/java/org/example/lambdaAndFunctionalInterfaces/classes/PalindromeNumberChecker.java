package org.example.lambdaAndFunctionalInterfaces.classes;

import org.example.lambdaAndFunctionalInterfaces.interfaces.NumberChecker;

public class PalindromeNumberChecker {
    public NumberChecker isPalindrome = num -> {
        int reverse = 0,lastDigit;
        for (int i = num; i > 0; i/=10) {
            lastDigit = i % 10;
            reverse = reverse * 10 + lastDigit;
        }
        return reverse==num;
    };
}
