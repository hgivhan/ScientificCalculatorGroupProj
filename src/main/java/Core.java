import java.util.Scanner;

public class Core {

    double num1;
    double num2;
    char operator;
    int exponent;

    Scanner chdScan = new Scanner(System.in);

    public static void Simple(Strings[] args) {
        System.out.println("Enter first number: ");
        num1 = chdScan.nextDouble();
        else(System.out.println("Enter second number: "));
        num2 = chdScan.nextDouble();
        System.out.println("Choose operator: ");
        operator = chdScan.next.charAt(0);
    }

    double output;

        switch(operator)

    {
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
        if(output =num1 /0)

    {
        System.out.println("ERR");
    }
        else

    {
        System.out.println(output);
    }

    public static void Square(Strings[] args) {
        System.out.println("Enter first number: ");
        num1 = chdScan.nextDouble();
        System.out.println("Choose operator: ");
        operator = chdScan.next.charAt(0);
        System.out.println(Math.sqrt(num1));
    }

    public static void Exp(Strings[] args) {
        System.out.println("Enter first number: ");
        num1 = chdScan.nextDouble();
        System.out.println("Choose operator: ");
        operator = chdScan.next.charAt(0);
        System.out.println("Enter exponent: ");
        exponent = chdScan.next.int();
        System.out.println(Math.pow(num1, x));
    }
}
