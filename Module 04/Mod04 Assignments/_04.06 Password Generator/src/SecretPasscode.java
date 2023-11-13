/**
 * Randomly generate passwords.
 *
 * @author Cristopher Encarnacion
 * @version 11/12/2023
 *
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;

public class SecretPasscode
{
    public static void main(String [] args) throws IOException
    {
        String userChoice = "Y";
        String password = "";
        int pwLength;
        int randNum;

        // initializations
        File passwordFile = new File("passwords.txt");
        PrintWriter outFile = new PrintWriter(passwordFile);
        Scanner inFile = new Scanner(passwordFile);
        Scanner in = new Scanner(System.in);

        System.out.println("**********************************************************");
        System.out.println("Welcome to a simple password generator. \nThe password will include lowercase, uppercase, & numbers.");

        while (!userChoice.equalsIgnoreCase("N")) {
            while (true) {
                System.out.print("Enter a password length (6 or more): ");
                pwLength = in.nextInt();

                // Validate password length
                if (pwLength < 6) {
                    System.out.println("\tPassword length too short. Please try again.");
                }
                else
                    break;
            }

            // Randomly choose one character from 26 uppercase letters, 26 lowercase letters, and numbers 0-9
            for(int counter = 1; counter <= pwLength; counter++) {
                randNum = (int) (Math.random() * 62) + 1;
                if (randNum <= 10) {        // numbers
                    randNum += 47;
                }
                else if (randNum <= 36) {   // uppercase letters
                    randNum += 54;
                }
                else {                      // lowercase letters
                    randNum += 60;
                }
                password += (char) randNum; // create password
            }

            outFile.println(password);
            System.out.println("\nA password has been written to the text file");
            password = "";

            while (true) {
                System.out.print("Would you like to generate another password?\tY/N ");
                userChoice = in.next();

                // Validate user choice
                if (!userChoice.equalsIgnoreCase("Y") && !userChoice.equalsIgnoreCase("N")) {
                    System.out.println("\tPlease select 'Y' or 'N'");
                }
                else
                    break;
            }
        }

        outFile.close();
        System.out.println("\nThank you for using the Pass Code Generator.");
        System.out.println("\nHere are your randomly generated codes:");

        // Print all passwords to system
        for (int counter = 1; inFile.hasNext(); counter++) {
            System.out.println("  " + counter + ".\t" + inFile.nextLine());
        }
    }
}