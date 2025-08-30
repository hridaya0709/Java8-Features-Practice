package org.example.lambdaAndFunctionalInterfaces.classes.logic;

//Write a Predicate<Integer> that checks if a number is even.
//Filter a list of numbers using this predicate.

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.List;
public class IsEvenPredicate {

    public void isEven() {
        Predicate<Integer> isEven = i -> i%2==0;
        List<Integer> nums = Arrays.asList(2,4,6,7,4,4,5,65,7,8,55);

        for(Integer num : nums) {
            if(isEven.test(num)) {
                System.out.println(num);
            }
        }
    }

}
