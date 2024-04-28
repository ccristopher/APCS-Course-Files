/**
 * This class runs Fibonacci.java
 *
 * @author Cristopher Encarnacion
 * @version 04/25/2024
 */

import java.util.Scanner;

public class FibonacciTester {
    static final Scanner in = new Scanner(System.in);
    static int input;

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        System.out.println("Enter an integer value from [0 - 46] or [-1] to quit: ");
        input = in.nextInt();

        if (input >= 0 && input <= 46) {
            System.out.println("Fibonacci number for " + input + ": " + Fibonacci.findNumber(input));
            menu();
        }
        else if (input != -1)
            menu();
    }
}