/**
 * FishV3 client class
 *
 * @author Cristopher Encarnacion
 * @version 12/12/2023
 */

public class FishTesterV3 {

    // prints a fish's information
    public static void printFish(String name, double pos1, double pos2, int offspring) {
        System.out.println(name + "\t\t" + pos1 + "\t\t\t" + pos2 + "\t\t\t" + offspring);
    }

    public static void main(String[] args) {
        // parameters for the fish
        String name = "Salmon";
        double pos1 = 22.0;
        double speed = 0.75;
        int offspring = 0;

        double pos2;

        FishV3 salmon = new FishV3();

        // simulate swimming and breeding during a span of 24 hours
        pos2 = salmon.swim(pos1, speed);
        offspring = salmon.breed(offspring);

        // print chart of fish information
        System.out.println("\t\t\t\t\tFish:");
        System.out.println("Name \t Position 1 \t Position 2 \t Offspring");
        System.out.println("==================================================");
        printFish(name, pos1, pos2, offspring);
    }
}