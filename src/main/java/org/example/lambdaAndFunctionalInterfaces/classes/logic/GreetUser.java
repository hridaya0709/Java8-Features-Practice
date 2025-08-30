package org.example.lambdaAndFunctionalInterfaces.classes.logic;

import java.util.function.Consumer;

public class GreetUser {
    public Consumer<String> upperCaseName = x -> System.out.println(x.toUpperCase());
    public Consumer<String> appendHello = x -> System.out.print("Hello ");
}
