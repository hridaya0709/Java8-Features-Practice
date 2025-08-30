package org.example.lambdaAndFunctionalInterfaces.classes;
import org.example.lambdaAndFunctionalInterfaces.interfaces.NumberChecker;

public class PrimeNumberChecker {
    public NumberChecker isPrime = num -> {
            for(int i=2; i<num; i++) {
                if(num%i==0) return false;
            }
            return true;
    };
}
