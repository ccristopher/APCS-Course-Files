/**
 * This program inputs the name, weight in pounds, and
 * height in feet-inches. With this information, it
 * calculates and outputs the user's weight in
 * kilograms, height in meters, and body mass index.
 *
 * @author Cristopher Encarnacion
 * @version 10/4/2023
 */
import java.util.Scanner;
public class BMI {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String weightStatus;

        // Collect Information
        System.out.print("Enter your name (First Last): ");
        String name = in.next() + in.nextLine();

        System.out.print("Enter your weight in pounds (e.g. 180): ");
        int weightPounds = in.nextInt();

        System.out.print("Enter your height in feet and inches (eg. 5 4): ");
        int heightFt = in.nextInt();
        int heightIn = in.nextInt();

        // Convert height and weight
        double heightM = ((heightFt * 12) + heightIn) / 39.37;

        double weightKG = weightPounds / 2.205;

        // Calculate BMI
        double bmi = weightKG / Math.pow(heightM, 2);

        // Round BMI to one decimal place
        double parsedBMI = (int) (10 * bmi) / 10.0;

        // Calculate bmi category
        if (parsedBMI < 18.5)
            weightStatus = "Underweight";
        else if (parsedBMI < 25.0)
            weightStatus = "Normal";
        else if (parsedBMI < 30.0)
            weightStatus = "Overweight";
        else
            weightStatus = "Obese";

        // display results
        System.out.println("\nBody Mass Index Calculator");
        System.out.println("==============================");
        System.out.println("Name: " + name);

        // display numeric values to one decimal place
        System.out.println("Height (m): " + (int) (10 * heightM) / 10.0);
        System.out.println("Weight (kg): " + (int) (10 * weightKG) / 10.0);
        System.out.println("BMI: " + parsedBMI);
        System.out.println("Category: " + weightStatus);
    }
}