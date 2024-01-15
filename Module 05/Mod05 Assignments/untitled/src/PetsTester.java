/**
 * Pet client class
 *
 * @author Cristopher Encarnacion
 * @version 12/14/2023
 */

import java.util.Scanner;
public class PetsTester {
    // method to print pet information
    public static void printPet(String name, String breed, int age) {
        System.out.println("===============================================");
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
        System.out.println("Age: " + age);
    }

    // main method
    public static void main (String [] args)
    {
        // initialize variables
        String name;
        String breed;
        int age;

        Scanner in = new Scanner(System.in);
        String input;

        for (boolean runAgain = true; runAgain; in.nextLine()) {
            // collect information
            System.out.print("Name of pet: ");
            name = in.nextLine();
            System.out.print("Breed of pet: ");
            breed = in.nextLine();
            System.out.print("Age of pet: ");
            age = in.nextInt();

            // create pet object
            Pets pet = new Pets(name, breed, age);

            // send pet information to printer
            printPet(pet.getName(), pet.getBreed(), pet.getAge());

            // ask if user wants to print again
            System.out.print("Would you like to print another pet? (Y or N): ");
            input = in.next();
            if (!input.equalsIgnoreCase("Y") && !input.equalsIgnoreCase("yes")) {
                System.out.print("Goodbye!");
                runAgain = false;
            }
        }
    }
}