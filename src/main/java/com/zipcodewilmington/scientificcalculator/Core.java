package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class Core {
    double answer;

    Scanner chdScan = new Scanner(System.in);

    public void Basic()
    {
        Console.println("Basic Calculator"
                + "\n1: Add"
                + "\n2: Subtract"
                + "\n3: Multiply"
                + "\n4: Divide"
                + "\n5: Return to Main Menu");

    }

    /* method for + - * /
with ERR message for division by 0 and wrong operator*/

    public Double add(Double num1, Double num2) {
        answer = num1 + num2;
        return answer;
    }

    public Double subtract(Double num1, Double num2) {
        answer = num1 + num2;
        return answer;
    }

    public Double multiply(Double num1, Double num2) {
        answer = num1 + num2;
        return answer;
    }

    public Double divide(Double num1, Double num2) {
        answer = num1 + num2;
        return answer;
    }

//    private static double subtract(double num1, double num2) {
//        return num1 - num2;
//    }

//    private static double Multiply(double num1, double num2) {
//        return num1 * num2;
//    }
    private static double Divide(double num1, double num2, String errormsg) {
        errormsg = "Err, cannot divide by 0";
        Double answer = new Double(0);

        if (num2 == 0) {
            System.out.println(errormsg);
        } else {
            answer = num1 / num2;
        }
        return answer;
    }

    private static double SquareRoot(double num1) {
        return Math.sqrt(num1);
    }

    private static double Square(double num1, int exponent) {
        return Math.pow(num1, exponent);
    }

    private static double NegPos(int num1) {
        return num1 *= -1;
    }

    private static double Inverse(double num1){
        return 1 / num1;
    }


}
