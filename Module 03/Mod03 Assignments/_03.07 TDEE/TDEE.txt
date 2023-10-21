/**
 * This program inputs the name, bmr, gender, and
 * activity level of a user. With this information,
 * it calculates and outputs the user's TDEE.
 *
 * @author Cristopher Encarnacion
 * @version 10/12/2023
 */
import java.util.Scanner;

public class TDEE {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double activityFactor = 0;

        // collect information
        System.out.print("Please enter your name: ");
        String name = in.next() + in.nextLine();

        System.out.print("Please enter your BMR: ");
        double bmr = in.nextDouble();

        System.out.print("Please enter your gender (M/F): ");
        String gender = in.next().toUpperCase(); // convert input to uppercase

        System.out.println();
        System.out.println("Select your activity level");
        System.out.println("[A] Resting (Sleeping, Reclining)");
        System.out.println("[B] Sedentary (Restricted Mobility)");
        System.out.println("[C] Light (Sitting, Standing)");
        System.out.println("[D] Moderate (Light Manual labor, Dancing, Riding Bike)");
        System.out.println("[E] Very Active (Team Sports, Hard Manual Labor)");
        System.out.println("[F] Extremely Active (Full-time Athlete, Heavy Manual Labor)");
        System.out.println();
        System.out.print("Enter the letter corresponding to your activity level: ");
        String activityLevel = in.next().toUpperCase();

        // find activity factor or print error
        if (activityLevel.equals("A"))
            activityFactor = 1.0;
        else if (activityLevel.equals("B"))
            activityFactor = 1.3;
        else if (activityLevel.equals("C") && gender.equals("M"))
            activityFactor = 1.6;
        else if (activityLevel.equals("C") && gender.equals("F"))
            activityFactor = 1.5;
        else if (activityLevel.equals("D") && gender.equals("M"))
            activityFactor = 1.7;
        else if (activityLevel.equals("D") && gender.equals("F"))
            activityFactor = 1.6;
        else if (activityLevel.equals("E") && gender.equals("M"))
            activityFactor = 2.1;
        else if (activityLevel.equals("E") && gender.equals("F"))
            activityFactor = 1.9;
        else if (activityLevel.equals("F") && gender.equals("M"))
            activityFactor = 2.4;
        else if (activityLevel.equals("F") && gender.equals("F"))
            activityFactor = 2.2;
        else {
            System.out.print("You have previously selected a non-menu item. Please re-run the program.");
            System.exit(0);
        }

        // calculate tdee
        double tdee = activityFactor * bmr;

        // print results
        System.out.println();
        System.out.println();
        System.out.println("Your results:");
        System.out.print("Name: " + name);
        System.out.print("                ");
        System.out.println("Gender: " + gender);
        System.out.print("BMR: " + bmr);
        System.out.println("                    ");
        System.out.println("Activity Factor: " + activityFactor);
        System.out.print("TDEE: " + tdee + " calories");
    }
}