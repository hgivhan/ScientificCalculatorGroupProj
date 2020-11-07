package com.zipcodewilmington.scientificcalculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {


    public void runMenu() {
        Core core = new Core();
        CoreAdvanced coreAdvanced = new CoreAdvanced();
        ScientificFeatures scientificCalc = new ScientificFeatures();
        Memory memoryFunction = new Memory();

        Scanner scan = new Scanner(System.in);
        boolean keepOn = true;
//        System.out.println("Welcome to CHD's Calculator");

        while (keepOn) {
            Console.print("Welcome to CHD's Calculator\n" +
                    "Choose from menu:\n" +
                    "Type 1 - Basic Calculator: \n" +
                    "Type 2 - Advanced Calculator: \n" +
                    "Type 3 - Scientific Calculator: \n" +
                    "Type 4 - Memory: \n" +
                    "Type 5 - Quit \n" +
                    "Your work = " + "\n" +
                    "Enter choice here: ");

            try {
                int input = scan.nextInt();
                switch (input) {
                    case 1:
                        core.Basic();
                        Double input1 = new Double(0);
                        Double input2 = new Double(0);

                        String mode = Console.getStringInput("Enter the mode: ");

                        input1 = Console.getDoubleInput("Enter the first input: ");
                        input2 = Console.getDoubleInput("Enter the second input: ");

                        // --- INSERT CODE TO UTILIZE VALUE IN MEMORY HERE --- //

                        Double answer = new Double(0);

                        if (mode.equals("1")) {
                            answer = core.add(input1, input2);
                        } else if (mode.equals("2")) {
                            answer = core.subtract(input1, input2);
                        } else if (mode.equals("3")) {
                            answer = core.multiply(input1, input2);
                        } else if (mode.equals("4")) {
                            if( input2 == 0) {
                                Console.println("undefined");
                                answer = Double.NaN;
                            } else {
                                answer = core.divide(input1, input2);
                            }
                        } else if (mode.equals("5")) {
                            break;
                        } else {
                            Console.println("Not a valid selection, please select again");
                        }

                        Console.println(Double.toString(answer));

                        break;

                    case 2:
                        coreAdvanced.advanced();

                        String modeAdv = Console.getStringInput("Enter the mode: ");

                        Double advNum1 = new Double(0);
                        Double advNum2 = new Double(0);

                        advNum1 = Console.getDoubleInput("Enter the input for x: ");

                        // --- INSERT CODE TO UTILIZE VALUE IN MEMORY HERE --- //

                        Double advAnswer = new Double(0);

                        if (modeAdv.equals("1")) {
                            advAnswer = coreAdvanced.square(advNum1);
                        } else if (modeAdv.equals("2")) {
                            advAnswer = coreAdvanced.squareRoot(advNum1);
                        } else if (modeAdv.equals("3")) {
                            advNum2 = Console.getDoubleInput("Enter the exponent value: ");
                            advAnswer = coreAdvanced.exponent(advNum1, advNum2);
                        } else if (modeAdv.equals("4")) {
                            advAnswer = coreAdvanced.switchSign(advNum1);
                        } else if (modeAdv.equals("5")) {
                            if (advNum1 == 0) {
                                Console.println("undefined");
                                advAnswer = Double.NaN;
                            } else {
                                advAnswer = coreAdvanced.inverse(advNum1);
                            }
                        } else if (modeAdv.equals("6")) {
                            break;
                        } else {
                            Console.println("Not a valid selection, please select again");
                        }

                        Console.println(Double.toString(advAnswer));

                        break;

                    case 3:
                        scientificCalc.scientificMenu();

                        String modeSci = Console.getStringInput("Enter the mode: ");

                        Double sciNum = new Double(0);

                        sciNum = Console.getDoubleInput("Enter the input for x: ");

                        // --- INSERT CODE TO UTILIZE VALUE IN MEMORY HERE --- //

                        Double sciAnswer = new Double(0);

                        if (modeSci.equals("1")) {
                            sciAnswer = scientificCalc.calcSine(sciNum);
                        } else if (modeSci.equals("2")) {
                            sciAnswer = scientificCalc.calcCosine(sciNum);
                        } else if (modeSci.equals("3")) {
                            sciAnswer = scientificCalc.calcTangent(sciNum);
                        } else if (modeSci.equals("4")) {
                            sciAnswer = scientificCalc.calcInverseSine(sciNum);
                        } else if (modeSci.equals("5")) {
                            sciAnswer = scientificCalc.calcInverseCosine(sciNum);
                        } else if (modeSci.equals("6")) {
                            sciAnswer = scientificCalc.calcInverseTangent(sciNum);
                        } else if (modeSci.equals("7")) {
                            sciAnswer = scientificCalc.calcLog(sciNum);
                        } else if (modeSci.equals("8")) {
                            sciAnswer = scientificCalc.calcInverseLog(sciNum);
                        } else if (modeSci.equals("9")) {
                            sciAnswer = scientificCalc.calcNaturalLog(sciNum);
                        } else if (modeSci.equals("10")) {
                            sciAnswer = scientificCalc.calcInverseNaturalLog(sciNum);
                        } else if (modeSci.equals("11")) {
                            sciAnswer = scientificCalc.calcFactorial(sciNum);
                        } else if (modeSci.equals("12")) {
                            sciAnswer = scientificCalc.calcAbs(sciNum);
                        } else if (modeSci.equals("13")) {
                            sciAnswer = scientificCalc.calcAgeDogYears(sciNum);
                        } else if (modeSci.equals("14")) {
                            break;
                        } else {
                            Console.println("Not a valid selection, please select again");
                        }

                        Console.println(Double.toString(sciAnswer));

                        break;

                    case 4:
                        memoryFunction.memoryActions();
                        Double memoryInput = new Double(0);

                        String memoryMode = Console.getStringInput("Enter the mode: ");

                        while(!memoryMode.equals("4")) {
                            if (memoryMode.equals("1")) {
                                memoryInput = Console.getDoubleInput("Enter the value you want to add to the value currently in memory");
                                memoryFunction.updateMemory(memoryInput);
                                Console.println("Current value stored in memory: " + memoryFunction.getMemory());
                                break;
                            } else if (memoryMode.equals("2")) {
                                memoryFunction.clearMemory();
                                Console.println("Memory has been cleared");
                                break;
                            } else if (memoryMode.equals("3")) {
                                Console.println("Current value stored in Memory: " + memoryFunction.getMemory());
                                break;
                            } else {
                                Console.println("Invalid option selected, please try again.");
                                break;
                            }
                        }
                        break;

                    case 5:
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

/* Hillary: In the Menu class, there needs to be a runMenu() method because
       I used Menu.runMenu() to call the Menu class from the MainApplication class..
       If you want to change the name of the method, that's cool as long as the Menu
       and MainApplication methods are the same so that they are linked, does that make sense? */

/* Hillary: This was all suggested in Main Application class (idk why),
but since we have a separate menu class now, I wanted to paste it here
in case it's helpful for you as you update this Menu class:

Console.println("Welcome to my calculator!");
        String s = Console.getStringInput("Enter a string");
        Integer i = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter a double.");

        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a d", d);

         */