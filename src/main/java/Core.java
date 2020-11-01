import java.util.Scanner;

public class Core {

    public double num1;
    public double num2;
    public char operator;
    public int exponent;
    public double output;

    Scanner chdScan = new Scanner(System.in);

// default state... is this how to do it?

    System.out.println("0");

/* method for + - * /
with ERR message for division by 0 and wrong operator*/

    public void Simple(Strings[] args) {
        System.out.println("Enter first number: ");
        num1 = chdScan.nextDouble();
        else(System.out.println("Enter second number: "));
        num2 = chdScan.nextDouble();
        System.out.println("Choose operator: ");
        operator = chdScan.next.charAt(0);

        switch (operator) {
            case '+':
                output = num1 + num2;
                break;
            case '-':
                output = num1 - num2;
                break;
            case '*':
                output = num1 * num2;
                break;
            case '/':
                output = num1 / num2;
                break;
            default:
                System.out.printf("ERR: wrong operator");
        }
        if (output = num1 / 0) {
            System.out.println("ERR");
        } else {
            System.out.println(output);
        }
    }

// method for finding square root

    public void SquareRoot(Strings[] args) {

        System.out.println("Enter first number: ");
        num1 = chdScan.nextDouble();
        System.out.println("Choose operator: ");
        operator = chdScan.next.charAt(0);
        output = Math.sqrt(num1);

        System.out.println(output);
    }

// method for exponents

    public void Square(Strings[] args) {

        System.out.println("Enter first number: ");
        num1 = chdScan.nextDouble();
        System.out.println("Choose operator: ");
        operator = chdScan.next.charAt(0);
        System.out.println("Enter exponent: ");
        exponent = chdScan.next.int();
        output = Math.pow(num1, x);

        System.out.println(output);
    }

//method for changing number to negative or positive

    public void NegPos(Strings[] args) {
        double change = output *= -1;
        System.out.println(output);
    }

//method for inverting a number

     public void Inverse(Strings[] args){
        double inversion = 1 / output;
         System.out.println(output);
     }

//method for clearing display for general use, must use if Error
     public void Clear(Strings[] args){
        int reset = 0;
        System.out.println(reset);
      }
    }

