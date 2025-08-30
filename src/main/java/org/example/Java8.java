package org.example;

import org.example.lambdaAndFunctionalInterfaces.classes.*;
import org.example.lambdaAndFunctionalInterfaces.interfaces.MathOperation;
import org.example.lambdaAndFunctionalInterfaces.interfaces.StringFormatter;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Java8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Set-1
        IsEvenPredicate isEvenPredicate = new IsEvenPredicate();
        isEvenPredicate.isEven();

        StringLenFunction stringLenFunction = new StringLenFunction();
        stringLenFunction.calcLenOfStr();

        UpperCaseStringConsumer upperCaseStringConsumer = new UpperCaseStringConsumer();
        upperCaseStringConsumer.convertStringToUpperCase();

        GenerateRandomNumSupplier generateRandomNumSupplier = new GenerateRandomNumSupplier();
        generateRandomNumSupplier.generateRandomNum();
        generateRandomNumSupplier.generateRandomNum();

        // Set-2
        StringComparator stringComparator = new StringComparator();
        List<String> str = Arrays.asList("Himalayas", "Kanyakumari", "Thar desert", "Kanchenjunga");
        stringComparator.processStr(str);

        StringConcatenationFunction stringConcatenationFunction = new StringConcatenationFunction();
        String str1 = "pranathi";
        System.out.println(stringConcatenationFunction.getmodifiedString(str1));

        CheckStringPredicate checkStringPredicate = new CheckStringPredicate();
        checkStringPredicate.checkString("home");
        checkStringPredicate.checkString("Army loves bangtan");

        // Set-3
        MathOperation addOperation = new AddNumbers(10, 90);
        MathOperation subtractOperation = new SubtractNumbers(40, 80);
        MathOperation multiplyOperation = new MultiplyNumbers(10, 20);
        MathOperation divideOperation = new DivideNumbers(40, 10);

        printObject(addOperation);
        printObject(subtractOperation);
        printObject(multiplyOperation);
        printObject(divideOperation);

        StringFormatter stringUpperCaseFormatter = new UppercaseFormatter();
        print(stringUpperCaseFormatter.format("india is my country"));

        StringFormatter stringReverseFormatter = new StringReverseFormatter();
        print(stringReverseFormatter.format("Hyderabad is in Telangana"));

        StringFormatter stringRemoveSpacesFormatter = new RemoveSpacesFormatter();
        print(stringRemoveSpacesFormatter.format("No spaces are allowed"));

        int n = sc.nextInt();
        PrimeNumberChecker o = new PrimeNumberChecker();
        print(o.isPrime.check(n));

        n = sc.nextInt();
        PalindromeNumberChecker o1 = new PalindromeNumberChecker();
        print(o1.isPalindrome.check(n));

        n = sc.nextInt();
        ArmstrongNumberChecker o2 = new ArmstrongNumberChecker();
        print(o2.isArmstrong.check(n));


    }

    public static <T> void printObject(T printable){
        System.out.println(printable.toString());
    }
    public static <T> void print(T printable){
        System.out.println(printable);
    }

}