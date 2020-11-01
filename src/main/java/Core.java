import java.util.Scanner;

public class Core {

    Scanner chdScan = new Scanner(System.in);


/* method for + - * /
with ERR message for division by 0 and wrong operator*/

    private static double Add(double num1, double num2) {
        return num1 + num2;
    }

    private static double Subtract(double num1, double num2) {
        return num1 - num2;
    }

    private static double Multiply(double num1, double num2) {
        return num1 * num2;
    }
    private static double Divide(double num1, double num2, String errormsg) {
        errormsg = "Err, cannot divide by 0";
        if (num2 == 0) {
            System.out.println(errormsg);
        } else {
            return num1 / num2;
        }
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

