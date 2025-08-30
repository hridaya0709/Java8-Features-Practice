package org.example.lambdaAndFunctionalInterfaces.classes.logic;

import org.example.lambdaAndFunctionalInterfaces.interfaces.MathOperation;

public class DivideNumbers implements MathOperation {

    int result = 0;
    public DivideNumbers(int x, int y) {
        this.result = operate(x, y);
    }
    public int operate(int x, int y){
        result = x/y;
        return result;
    }
    public String toString() {
        return "Division is : " + result;
    }
}
