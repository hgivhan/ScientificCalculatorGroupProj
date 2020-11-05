package com.zipcodewilmington.scientificcalculator;

public class CoreAdvanced {
    double answer;

    public void advanced()
    {
        Console.println("Advanced Calculator Options"
                + "\n1: x^2"
                + "\n2: Square Root of x"
                + "\n3: x^y"
                + "\n4: Switch sign of x"
                + "\n5: 1/x"
                + "\n6: Cancel - return to the Main Menu");
    }

    // method to find advNum1^2
    public Double square(Double advNum1) {
        answer = Math.pow(advNum1, 2);
        return answer;
    }

    // method to find square root of advNum1
    public Double squareRoot(Double advNum1) {
        answer = Math.sqrt(advNum1);
        return answer;
    }

    //method to find exponentiation of advNum1 by advNum2
    public Double exponent(Double advNum1, Double advNum2) {
        answer = Math.pow(advNum1, advNum2);
        return answer;
    }

    // method to switch sign of advNum1
    public Double switchSign(Double advNum1) {
        answer = advNum1 * -1;
        return answer;
    }

    // method to find inverse of advNum1
    public Double inverse(Double advNum1){
        answer = 1 / advNum1;
        return answer;
    }


}
