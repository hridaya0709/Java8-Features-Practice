package org.example.lambdaAndFunctionalInterfaces.classes;

import org.example.lambdaAndFunctionalInterfaces.interfaces.MathOperation;

public class MultiplyNumbers implements MathOperation {

    int result = 0;
    public MultiplyNumbers(int x, int y){
        this.result = operate(x, y);
    }
    @Override
    public int operate(int a, int b) {
        result = a*b;
        return result;
    }
    public String toString() {
        return "Multiplication is : " + result;
    }
}
