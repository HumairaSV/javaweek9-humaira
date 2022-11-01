package java_week9_humaira.calculate;

import java.util.Objects;
import java.util.Scanner;

public class Main extends Calculator {
    public static void main(String[] args) {
        //Scanner declaration to read input from the console
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the first number: ");
            double x = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double y = scanner.nextDouble();
            System.out.print("Enter the operator you wish to use for calculation: ");
            char ch = scanner.next().charAt(0);
            Calculator calcs = new Calculator();


            try {
                calcs.calculateResult(x, y, ch);

            } catch (ArithmeticException e) {
                System.out.println("Invalid operation");
            }
            System.out.print("Would you like to do more calculation\n" + " Please enter “Y” or “N” :");
            char ans = scanner.next().charAt(0);

            if (ans == 'n') {
                break;

            }

        }
        //closing the scanner object
        scanner.close();
    }
}
