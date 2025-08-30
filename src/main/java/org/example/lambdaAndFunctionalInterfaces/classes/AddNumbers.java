package org.example.lambdaAndFunctionalInterfaces.classes;

import org.example.lambdaAndFunctionalInterfaces.interfaces.MathOperation;

public class AddNumbers implements MathOperation {

    int result = 0;
    public AddNumbers(int x, int y){
        this.result = operate(x,y);
    }
    public int operate(int x, int y){
        result = x+y;
        return result;
    }
    public String toString() {
        return "Addition is : " + result;
    }
}
