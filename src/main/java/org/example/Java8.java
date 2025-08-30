package org.example;

import org.example.lambdaAndFunctionalInterfaces.classes.data.EmployeeData;
import org.example.lambdaAndFunctionalInterfaces.classes.logic.*;
import org.example.lambdaAndFunctionalInterfaces.classes.model.Employee;
import org.example.lambdaAndFunctionalInterfaces.interfaces.Calculator;
import org.example.lambdaAndFunctionalInterfaces.interfaces.MathOperation;
import org.example.lambdaAndFunctionalInterfaces.interfaces.StringFormatter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Java8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 0;
        String s = "";

        /*Set-1*/
        IsEvenPredicate isEvenPredicate = new IsEvenPredicate();
        isEvenPredicate.isEven();

        StringLenFunction stringLenFunction = new StringLenFunction();
        stringLenFunction.calcLenOfStr();

        UpperCaseStringConsumer upperCaseStringConsumer = new UpperCaseStringConsumer();
        upperCaseStringConsumer.convertStringToUpperCase();

        GenerateRandomNumSupplier generateRandomNumSupplier = new GenerateRandomNumSupplier();
        generateRandomNumSupplier.generateRandomNum();
        generateRandomNumSupplier.generateRandomNum();

        /*Set-2*/
        StringComparator stringComparator = new StringComparator();
        List<String> str = Arrays.asList("Himalayas", "Kanyakumari", "Thar desert", "Kanchenjunga");
        stringComparator.processStr(str);

        StringConcatenationFunction stringConcatenationFunction = new StringConcatenationFunction();
        String str1 = "pranathi";
        System.out.println(stringConcatenationFunction.getmodifiedString(str1));

        CheckStringPredicate checkStringPredicate = new CheckStringPredicate();
        checkStringPredicate.checkString("home");
        checkStringPredicate.checkString("Army loves bangtan");

        /*Set-3*/
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

        n = sc.nextInt();
        PrimeNumberChecker o = new PrimeNumberChecker();
        print(o.isPrime.check(n));

        n = sc.nextInt();
        PalindromeNumberChecker o1 = new PalindromeNumberChecker();
        print(o1.isPalindrome.check(n));

        n = sc.nextInt();
        ArmstrongNumberChecker o2 = new ArmstrongNumberChecker();
        print(o2.isArmstrong.check(n));

         /*Set-4*/
        /*Employee Filtering (Predicate)
        Create an Employee class with name, age, and salary.
        Use predicates to filter:
        employees older than 30
        employees earning more than 50k*/

        EmployeeData source = new EmployeeData();
        List<Employee> employeeData = source.getEmployees();
        CheckEmployeeAge checkEmployeeAge = new CheckEmployeeAge();
        CheckEmployeeSalary checkEmployeeSalary = new CheckEmployeeSalary();

        List<Employee> filteredEmps = employeeData.stream()
                .filter(checkEmployeeAge.checkAgeGreaterThan30)
                .filter(checkEmployeeSalary.checkSalaryGreaterThan50T)
                .toList();

        print(filteredEmps);

        /*String Processing (Function & Consumer)
        Given a list of sentences,
        use Function<String, Integer> to count words in each sentence.
        use Consumer<Integer> to print word count in a nice format.*/

        System.out.print("Enter the number of sentences to be processed: ");
        n = sc.nextInt();

        List<String> sentences = new ArrayList<>();
        print("Enter the sentences one by one");
        sc.nextLine();
        for(int i=0; i<n; i++) {
            String s1 = sc.nextLine();
            sentences.add(s1);
        }

        WordsCounter wc  = new WordsCounter();
        List<Integer> counts = wc.countWords(sentences);
        PrintWordCountsInSentences pwc = new PrintWordCountsInSentences();

        for(int i=0; i<n; i++) {
            print("Words in " + sentences.get(i));
            pwc.print.accept(counts.get(i));
        }

        /*Chained Consumers
        Create two consumers:
        one that prints a name in uppercase
        one that prints "Hello " before the name
        Chain them using andThen() and test with a list of names.*/

        print("How many users?: ");
        n = sc.nextInt();

        List<String> users = new ArrayList<>();
        sc.nextLine();
        print("Enter the names of the user one by one");
        for(int i=0; i<n; i++) {
            String s1 = sc.nextLine();
            users.add(s1);
        }

        GreetUser gu = new GreetUser();
        users.forEach(gu.appendHello.andThen(gu.upperCaseName));

        /*Custom Calculator
        Create a calculator using a functional interface Calculator that takes two numbers and performs the operation passed as a lambda.
        Call it with +, -, *, / lambdas.*/

        Calculator cAdd = (a,b) -> a+b;
        Calculator cSubtract = (a,b) -> a-b;
        Calculator cMultiply = (a,b) -> a*b;
        Calculator cDivide = (a,b) -> {
            if(b==0) throw new ArithmeticException("Cannot divide by zero");
            return a/b;
        };

        print("Enter the two values :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();
        print("Enter any operation you want to perform from the following : (+, -, *, /)");
        String op = sc.nextLine();
        while(true) {
            switch (op.trim()) {
                case "+":
                    print("Addition is " + cAdd.calculate(a, b));
                    return;
                case "-":
                    print("Subtraction is " + cSubtract.calculate(a, b));
                    return;
                case "*":
                    print("Multiplication is " + cMultiply.calculate(a, b));
                    return;
                case "/":
                    print("Division is " + cDivide.calculate(a, b));
                    return;
                default:
                    print("Please select a valid operation from these: (+, -, *, /) ");
                    op=sc.nextLine();
            }
        }

        /*Stream + Lambda Integration
        Take a list of integers.
        Use stream().filter(), map(), and forEach() with lambdas to:
        print only even numbers
        square them
        print the results */

        print("How many numbers?");
        n = sc.nextInt();

        List<Integer> nums = new ArrayList<>();
        print("Enter the numbers one by one");
        for(int i=0; i<n; i++) {
            int num = sc.nextInt();
            nums.add(num);
        }

        EvenNumberFilter evenNumberFilter = new EvenNumberFilter();
        evenNumberFilter.getEvenNumbers(nums);

    }

    public static <T> void printObject(T printable){
        System.out.println(printable.toString());
    }
    public static <T> void print(T printable){
        System.out.println(printable);
    }

}