package org.example.lambdaAndFunctionalInterfaces.classes.logic;

import org.example.lambdaAndFunctionalInterfaces.interfaces.NumberChecker;

public class ArmstrongNumberChecker {
    public NumberChecker isArmstrong = num -> {
        int cubeSum = 0, digit;
        int digits = String.valueOf(num).length();
        for(int i = num; i > 0; i/=10){
            digit= i%10;
            cubeSum += (int) Math.pow(digit, digits);
        }
        return cubeSum==num;
    };
}
