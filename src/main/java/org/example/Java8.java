package org.example;

import org.example.lambdaAndFunctionalInterfaces.classes.data.EmployeeData;
import org.example.streams.classes.data.UsersData;
import org.example.lambdaAndFunctionalInterfaces.classes.logic.*;
import org.example.lambdaAndFunctionalInterfaces.classes.model.Employee;
import org.example.lambdaAndFunctionalInterfaces.interfaces.Calculator;
import org.example.lambdaAndFunctionalInterfaces.interfaces.MathOperation;
import org.example.lambdaAndFunctionalInterfaces.interfaces.StringFormatter;
import org.example.streams.classes.logic.*;

import java.util.*;
import java.util.stream.Collectors;

public class Java8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*6. Names Starting with a Letter
        From a list of names, print only those that start with "A".*/
        print("Names should start with? Select A-Z or a-z");
        String ch = sc.nextLine();

        if(ch.length() != 1) {
            print("Entered input is invalid");
            return;
        }

        UsersData usersData = new UsersData();
        ProcessUsers processUsers = new ProcessUsers();
        print("Names that starts with " + ch + " : ");
        printList(processUsers.getFilteredUsers(usersData.getUsers(), ch));

        /*7. Convert to Uppercase
        Take a list of names, convert them to uppercase using map().*/

        List<String> names = takeListStringInput();
        UppercaseListConverter uppercaseListConverter = new UppercaseListConverter();
        printList(uppercaseListConverter.convert(names));
    }

    public static List<Integer> takeListNumbersInput() {
        print("Enter the size : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> nums = new ArrayList<>();
        print("Enter the numbers one by one: ");
        for(int i=0; i<n; i++) {
            nums.add(sc.nextInt());
        }
        return nums;
    }

    public static List<String> takeListStringInput() {
        print("Enter the size : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<String> list = new ArrayList<>();
        print("Enter the strings one by one: ");
        sc.nextLine();
        for(int i=0; i<n; i++) {
            list.add(sc.nextLine());
        }
        return list;
    }

    public static <T> void print(T printable){
        System.out.println(printable);
    }

    public static <T> void printList(Collection<T> printable){

        if(!printable.isEmpty()) {
            System.out.println(printable.stream()
                    .map(Object::toString)
                    .collect(Collectors.joining(" ")));
        }
        else {
            System.out.println("List is empty or nothing was returned!");
        }

    }

    public static void LambdaExprFISet1() {
        /*Set-1*/
        /*Write a Predicate<Integer> that checks if a number is even.
          Filter a list of numbers using this predicate.*/
        IsEvenPredicate isEvenPredicate = new IsEvenPredicate();
        isEvenPredicate.isEven();

        /*Create a Function<String, Integer> that returns the length of a string.
          Apply it to a list of strings and print the lengths.*/
        StringLenFunction stringLenFunction = new StringLenFunction();
        stringLenFunction.calcLenOfStr();

        /*Write a Consumer<String> that prints a string in uppercase.
          Use it with forEach() on a list of names.*/
        UpperCaseStringConsumer upperCaseStringConsumer = new UpperCaseStringConsumer();
        upperCaseStringConsumer.convertStringToUpperCase();

        /*Write a Supplier<Double> that generates a random number.
          Call get() multiple times to print random numbers.*/
        GenerateRandomNumSupplier generateRandomNumSupplier = new GenerateRandomNumSupplier();
        generateRandomNumSupplier.generateRandomNum();
        generateRandomNumSupplier.generateRandomNum();
    }

    public static void LambdaExprFISet2() {
        /*Set-2*/
        /*Create a list of strings and sort them by length using a lambda-based Comparator.
        Then sort them in reverse alphabetical order.*/
        StringComparator stringComparator = new StringComparator();
        List<String> str = Arrays.asList("Himalayas", "Kanyakumari", "Thar desert", "Kanchenjunga");
        stringComparator.processStr(str);

        /*Function<String, String> → convert string to uppercase.
        Function<String, String> → add "!!!" at the end.*/
        StringConcatenationFunction stringConcatenationFunction = new StringConcatenationFunction();
        String str1 = "pranathi";
        System.out.println(stringConcatenationFunction.getmodifiedString(str1));

        /*Write a program using Predicate<String> to check:
        if a string is non-empty
        if it starts with "A".
        Combine them with and() and or() to test different strings.*/
        CheckStringPredicate checkStringPredicate = new CheckStringPredicate();
        checkStringPredicate.checkString("home");
        checkStringPredicate.checkString("Army loves bangtan");
    }

    public static void LambdaExprFISet3() {

        Scanner sc = new Scanner(System.in);

        /*Set-3*/
        /*Create a custom functional interface MathOperation with method int operate(int a, int b).
        Implement addition, subtraction, multiplication, division using lambdas.*/
        MathOperation addOperation = new AddNumbers(10, 90);
        MathOperation subtractOperation = new SubtractNumbers(40, 80);
        MathOperation multiplyOperation = new MultiplyNumbers(10, 20);
        MathOperation divideOperation = new DivideNumbers(40, 10);

        print(addOperation);
        print(subtractOperation);
        print(multiplyOperation);
        print(divideOperation);

        /*Define @FunctionalInterface interface StringFormatter { String format(String s); }.
        Implement:
        to uppercase
        reverse string
        remove spaces*/
        StringFormatter stringUpperCaseFormatter = new UppercaseFormatter();
        print(stringUpperCaseFormatter.format("india is my country"));

        StringFormatter stringReverseFormatter = new StringReverseFormatter();
        print(stringReverseFormatter.format("Hyderabad is in Telangana"));

        StringFormatter stringRemoveSpacesFormatter = new RemoveSpacesFormatter();
        print(stringRemoveSpacesFormatter.format("No spaces are allowed"));

        /*Create a functional interface NumberChecker with method boolean check(int n).
        Implement:
        check prime
        check palindrome number
        check Armstrong number*/
        int n3 = sc.nextInt();
        PrimeNumberChecker o = new PrimeNumberChecker();
        print(o.isPrime.check(n3));

        n3 = sc.nextInt();
        PalindromeNumberChecker o1 = new PalindromeNumberChecker();
        print(o1.isPalindrome.check(n3));

        n3 = sc.nextInt();
        ArmstrongNumberChecker o2 = new ArmstrongNumberChecker();
        print(o2.isArmstrong.check(n3));
    }

    public static void LambdaExprFISet4() {

        Scanner sc = new Scanner(System.in);

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
        int n2 = sc.nextInt();

        List<String> sentences = new ArrayList<>();
        print("Enter the sentences one by one");
        sc.nextLine();
        for(int i=0; i<n2; i++) {
            String s1 = sc.nextLine();
            sentences.add(s1);
        }

        WordsCounter wc  = new WordsCounter();
        List<Integer> counts = wc.countWords(sentences);
        PrintWordCountsInSentences pwc = new PrintWordCountsInSentences();

        for(int i=0; i<n2; i++) {
            print("Words in " + sentences.get(i));
            pwc.print.accept(counts.get(i));
        }

        /*Chained Consumers
        Create two consumers:
        one that prints a name in uppercase
        one that prints "Hello " before the name
        Chain them using andThen() and test with a list of names.*/

        print("How many users?: ");
        int n3 = sc.nextInt();

        List<String> users = new ArrayList<>();
        sc.nextLine();
        print("Enter the names of the user one by one");
        for(int i=0; i<n3; i++) {
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

        /*Stream + Lambda Integration
        Take a list of integers.
        Use stream().filter(), map(), and forEach() with lambdas to:
        print only even numbers
        square them
        print the results */

        print("How many numbers?");
        int n5 = sc.nextInt();

        List<Integer> nums = new ArrayList<>();
        print("Enter the numbers one by one");
        for(int i=0; i<n5; i++) {
            int num = sc.nextInt();
            nums.add(num);
        }

        SquareEvenNumberFilter squareEvenNumberFilter = new SquareEvenNumberFilter();
        squareEvenNumberFilter.getEvenNumbers(nums);

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
    }

    public static void StreamsSet1() {

        Scanner sc = new Scanner(System.in);
        /*Set-1*/
        /*1. Filter Even Numbers
        Take a list of integers. Use filter() to print only even numbers.*/
        print("Enter the size : ");
        int n1 = sc.nextInt();

        List<Integer> nums = new ArrayList<>();
        print("Enter the numbers: ");
        for(int i=0; i<n1; i++) {
            nums.add(sc.nextInt());
        }
        System.out.print("Even numbers are : ");
        FilterEvenNumbers filterEvenNumbers = new FilterEvenNumbers();
        filterEvenNumbers.print(nums);

        /*2. Square Numbers
        Take a list of integers. Use map() to square them and print.*/
        List<Integer> nums2 = takeListNumbersInput();
        SquareNumbers squareNumbers = new SquareNumbers();
        print("Output is: ");
        printList(squareNumbers.process(nums));

        /*3. Sort Strings
        Given a list of strings, sort them alphabetically using sorted() and print.*/
        List<String> words = takeListStringInput();
        SortStrings sortStrings = new SortStrings();
        print("Output is: ");
        printList(sortStrings.process(words));

        /*4. Unique Elements
        Given a list with duplicates, remove duplicates using distinct().*/
        List<Integer> nums4 = takeListNumbersInput();
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        print("After removing duplicates: ");
        printList(removeDuplicates.process(nums));

        /*5. Limit & Skip
        Take a list of integers and print only the first 5 numbers. Then, print all except the first 3.*/
        List<Integer> nums5 = takeListNumbersInput();
        LimitSkip limitSkip = new LimitSkip();
        print("How many numbers should be printed from the list?");
        int limit = sc.nextInt();
        printList(limitSkip.limit(nums, limit));
        print("How many numbers should be skipped from the list?");
        int skip = sc.nextInt();
        printList(limitSkip.skip(nums, skip));
    }

}