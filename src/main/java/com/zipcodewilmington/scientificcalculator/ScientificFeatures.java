package com.zipcodewilmington.scientificcalculator;

public class ScientificFeatures {

//    Double input = 0.0;
    Double answer;
//    String operation = "";

    public void scienceMenu() {
        Console.println("Scientific Calculator Functions"
                + "\n1: Switch Display Modes (binary, octal, decimal, hexadecimal)"
                + "\n2: Scientific Calculations"
        );
    }

    String scienceMenuInput = Console.getStringInput("Enter the function you'd like to use by entering the number");

    if (scienceMenuInput.equals("1")) {
        String displayMode = "";
        String displayModeAnswer = "";
        Integer userInput = 0;

        switchDisplayMode();

        displayMode = Console.getStringInput("Enter the desired display mode");

        // ENTER MEMORY ACCESS HERE

        if(displayMode.equals("1")) {
            displayModeAnswer = toBinary(userInput);
        } else if(displayMode.equals("2")) {
            displayModeAnswer = toOctal(userInput);
        } else if(displayMode.equals("3")) {
            displayModeAnswer = toDecmial(userInput);
        } else if(displayMode.equals("4")) {
            displayModeAnswer = toHexadecmial(userInput);
        } else if(displayMode.equals("5")) {
          Break;
        } else {
            Console.println("Invalid input");
        }

        Console.println(displayMode);
        Break;
    }










    public void scientificFeatures(){
        Console.println("Scientific Calculations"
                + "\n1: Sine"
                + "\n2: Cosine"
                + "\n3: Tangent"
                + "\n4: Inverse Sine"
                + "\n5: Inverse Cosine"
                + "\n6: Inverse Tangent"
                + "\n7: log"
                + "\n8: 10^x (inverse log)"
                + "\n9: Ln (natural log)"
                + "\n10: e^x (inverse natural log)"
                + "\n11: Factorial"
                + "\n12: Absolute - Special Feature"
                + "\n13: Age in dog years - Special Feature"
                + "\n12: Go back to Main Menu"
        );
    }


    //Switch display method
    public void switchDisplayMode() {
        Console.println("Display Options"
                + "\n1: Binary"
                + "\n2: Octal"
                + "\n3: Decimal"
                + "\n4: Hexadecimal"
                + "\n5: Go back to Main Menu"
        );
    }

    // --- SCIENTIFIC METHOD CALCULATIONS -- //

    //Sine method
    public Double calcSine(Double x) {
        answer = Math.sin(x);
        return answer;
    }

    //Cosine method
    public Double calcCosine(Double x) {
        answer = Math.cos(x);
        return answer;
    }

    //Tangent method
    public Double calcTangent(Double x) {
        answer = Math.tan(x);
        return answer;
    }

    //Inverse sine method
    public Double calcInverseSine(Double x) {
        answer = Math.asin(x);
        return answer;
    }

    //Inverse cosine method
    public Double calcInverseCosine(Double x) {
        answer = Math.acos(x);
        return answer;
    }

    //Inverse tangent method
    public Double calcInverseTangent(Double x) {
        answer = Math.atan(x);
        return answer;
    }

    //Log method
    public Double calcLog(Double x) {
        answer = Math.log10(x);
        return answer;
    }

    //Inverse log method ***********
    public Double calcInverseLog(Double x) {
//        answer = Math.inv.log10(x);
        return answer;
    }

    //Natural log method
    public Double calcNaturalLog(Double x) {
        answer = Math.log(x);
        return answer;
    }

    //Inverse natural log method ***********
    public Double calcInverseNaturalLog(Double x) {
//        answer = Math.inv.log(x);
        return answer;
    }

    //Factorial method
    public Double factorial(Double x) {
        Double factorial = 1.0;
        for (int i = 2; i <= x; i++) {
            factorial = factorial * 1;
        }
        answer = factorial;
        return answer;
    }

    //Absolute method
    public Double calcAbs(Double x) {
        answer = Math.abs(x);
        return answer;
    }

    //Age in dog years method
    public Double calcAgeDogYears(Double x) {
        answer = x * 7;
        return answer;
    }


    // --- CONVERSION FROM RADIANS TO DEGREES AND VICE VERSA --- //

    //Convert from radians to degrees ***********
    public Double convertRadiansDegrees(Double answer) {
        Double conversion = Math.toDegrees(answer);
        answer = conversion;
        return answer;
    }

    //Convert from degrees to radians ***********
    public Double convertDegreesRadians(Double answer) {
        Double conversion = Math.toRadians(answer);
        answer = conversion;
        return answer;
    }

    // -- SWITCH DISPLAYS -- //

}
