package com.zipcodewilmington.scientificcalculator;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Console {

    public static void print(String output, Object... args) {
        System.out.println(output, args);
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);

    }

    public static void startConsole(){
        Scanner scan = new Scanner(System.in);
        boolean keepOn = true;
        System.out.println("Welcome to CHD's Calculator"); 

        while (keepOn) {
            Console.print("\n" +
                    "Choose from menu:\n" +
                    "Type 1 - Basic Calculator: \n" +
                    "Type 2 - Scientific Calculator: \n" +
                    "Type 3 - Memory: \n" +
                    "Type 4 - Quit \n" +
                    "Your work = " + "\n" +
                    "Enter choice here: ");

            try {
                int input = scan.nextInt();
                switch (input) {
                    case 1:
                        // BasicCalculator.basicCalculatorOptions();
                        break;
                    case 2:
                        // ScientificCalculator.scientificCalculatorOptions();
                        break;
                    case 3:
                        // System.out.println(currentMemory);
                        break;
                    case 4:
                        keepOn = false;
                        System.out.println("Turning off!");
                }
            } catch (InputMismatchException e) {
                scan.next();
                System.out.println("\n" + "Please choose option that's on the menu bruh!");
            }

        }
        }

    }

    public static void main(String[] args) {


<<<<<<< HEAD
=======





        //print current number
        //print menu

    
>>>>>>> 980d09f4e09282ab12ce3c20e23c2c9a6b60fb8d


        /* print current number
        print menu

        ask input for a math utility selection
        call appropriate math function

        input numbers as argument(s)
        return updated number to console
    }

}

         */
