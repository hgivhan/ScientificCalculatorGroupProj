package com.zipcodewilmington.scientificcalculator;

public class Core {
    double answer;

    public void Basic()
    {
        Console.println("Basic Calculator Options"
                + "\n1: Add"
                + "\n2: Subtract"
                + "\n3: Multiply"
                + "\n4: Divide"
                + "\n5: Cancel - return to the Main Menu");
    }

    public Double add(Double num1, Double num2) {
        answer = num1 + num2;
        return answer;
    }

    public Double subtract(Double num1, Double num2) {
        answer = num1 - num2;
        return answer;
    }

    public Double multiply(Double num1, Double num2) {
        answer = num1 * num2;
        return answer;
    }

    public Double divide(Double num1, Double num2) {
        answer = num1 / num2;
        return answer;
    }

}
