/**
 * This class creates a list of prime numbers given a range.
 *
 * @author Cristopher Encarnacion
 * @version 04/21/2024
 */

import java.util.Scanner;

public class PrimeTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // the numbers assigned below assist in checking the validity of user input
        int lowerLimit = -1;
        int upperLimit = lowerLimit--;

        while (lowerLimit < 0) {
            System.out.print("enter a lower limit: ");
            lowerLimit = input.nextInt();
            input.nextLine();

            if (lowerLimit < 0)
                System.out.println("ERROR: enter a non-negative number");

            System.out.println();
        }

        while (upperLimit < lowerLimit) {
            System.out.print("enter an upper limit: ");
            upperLimit = input.nextInt();
            input.nextLine();

            if (upperLimit < lowerLimit)
                System.out.println("ERROR: enter a number larger than or equal to " + lowerLimit);

            System.out.println();
        }

        // create a primeList and print information about it
        PrimeList primeList = new PrimeList(lowerLimit, upperLimit);

        System.out.println("Generated list of prime numbers from range " + lowerLimit + " - " + upperLimit);
        System.out.println(primeList.getPrimeList());
        System.out.print("There were " + primeList.getPrimeList().size() + " prime numbers found.");
    }
}