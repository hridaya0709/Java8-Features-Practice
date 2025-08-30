package org.example.lambdaAndFunctionalInterfaces.classes;

import org.example.lambdaAndFunctionalInterfaces.interfaces.MathOperation;

public class SubtractNumbers implements MathOperation {

    int result = 0;
    public SubtractNumbers(int x, int y) {
        this.result = operate(x, y);
    }
    @Override
    public int operate(int a, int b) {
        result = a-b;
        return result;
    }
    public String toString() {
        return "Subtraction is : " + result;
    }
}
