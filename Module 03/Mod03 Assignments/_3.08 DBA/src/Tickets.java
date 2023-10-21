/**
 * This program collects user information, including name, age, and status as a first responder
 * or veteran, and calculates the cost of a ticket. Discounts are applied for first responders
 * and veterans. The program then prints a ticket with the user's details and ticket cost.
 *
 * @author Cristopher Encarnacion
 * @version 10/21/2023
 */
import java.util.Scanner;

public class Tickets {
    public static void printTicket(String name, String id, double price) {
        System.out.println("Welcome to the APCS Carnival, " + name + "!");
        System.out.println("Your user ID is " + id);
        System.out.println("The cost of your ticket is $" + price + ".");
        System.out.println("Have a great time at the APCS Carnival today!");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Parameters
        double discount = 0.50; // First responder & veteran discount
        double priceBracket1 = 2; // Children under 3
        double priceBracket2 = 9; // Children 3-5
        double priceBracket3 = 11; // Individuals 6-18
        double price = 12; // Adults over 18

        // Collect information
        System.out.print("Please enter your first and last name: ");
        String name = in.nextLine();
        String lastName = name.substring(name.indexOf(" ") + 1);

        System.out.print("Please enter your age as a number: ");
        int age = in.nextInt();

        System.out.print("Are you a first responder? [Y] or [N]: ");
        boolean firstResponder = in.next().equalsIgnoreCase("Y");

        System.out.print("Are you a veteran? [Y] or [N]: ");
        boolean veteran = in.next().equalsIgnoreCase("Y");

        // Validate age
        if (age < 0) {
            System.out.print("Please enter a valid age.");
            System.exit(0);
        }

        // Generate id
        String id = name.charAt(0) + lastName + ((int) (Math.random() * 1000 + 1));

        // Calculate price
        if (age < 3)
            price = priceBracket1;
        else if (age <= 5)
            price = priceBracket2;
        else if (age <= 18)
            price = priceBracket3;

        if (veteran || firstResponder)
            price -= price * discount;

        // Print ticket
        System.out.println();
        printTicket(name, id, price);
    }
}