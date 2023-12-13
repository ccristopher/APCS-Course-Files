/**
 * FishV8 client class
 *
 * @author Cristopher Encarnacion
 * @version 12/12/2023
 */

public class FishTesterV8 {
    // rounds a number to two decimal places
    public static double round(double pos) {
        return (double) Math.round(pos * 100) / 100;
    }

    // prints a fish's information
    public static void printFish(String name, double pos1, double pos2, int offspring) {
        pos1 = round(pos1);
        pos2 = round(pos2);
        System.out.println(name + "\t\t" + pos1 + "\t\t\t" + pos2 + "\t\t\t" + offspring);
    }

    public static void main(String[] args) {
        // make the fish
        FishV8 salmon = new FishV8();
        FishV8 tuna = new FishV8("Tuna", 10.4);
        FishV8 bass = new FishV8("Bass", 6.4, 0.6, 12);

        // simulate the fish
        salmon.setMyName("Salmon");                 // set name of fish
        String name1 = salmon.getMyName();          // get name of fish
        salmon.setMyPosition(9.0);                  // sets initial position
        double pos1_1 = salmon.getMyPosition();     // gets initial position
        salmon.swim(0.75, 9.0);       // simulates fish swimming and sets speed
        double pos2_1 = salmon.getMyPosition();     // gets second position
        salmon.breed();                             // breeds fish
        int offspring1 = salmon.getMyOffspring();   // gets number of offspring

        String name2 = tuna.getMyName();
        double pos1_2 = tuna.getMyPosition();
        tuna.swim();
        double pos2_2 = tuna.getMyPosition();
        tuna.breed(5);
        int offspring2 = tuna.getMyOffspring();

        String name3 = bass.getMyName();
        double pos1_3 = bass.getMyPosition();
        bass.swim();
        double pos2_3 = bass.getMyPosition();
        bass.breed();
        int offspring3 = bass.getMyOffspring();

        // print chart of fish information
        System.out.println("\t\t\t\t\tFish:");
        System.out.println("Name \t Position 1 \t Position 2 \t Offspring");
        System.out.println("==================================================");
        printFish(name1, pos1_1, pos2_1, offspring1);
        printFish(name2, pos1_2, pos2_2, offspring2);
        printFish(name3, pos1_3, pos2_3, offspring3);
    }
}