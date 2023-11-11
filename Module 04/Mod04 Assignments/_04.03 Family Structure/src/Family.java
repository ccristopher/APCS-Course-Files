/**
 * This program reads data from a file and
 * processes the data to calculate the composition
 * statistics for families with two children.
 *
 * @author Cristopher Encarnacion
 * @version 10/30/23
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Family {
    public static double percentageCalculation(int a, int b) {
        double percent = ((double) a / b) * 100; // calculate percentage
        return((int) (percent * 100) / 100.0); // round to the nearest hundredth
    }

    public static void main(String[] args) throws IOException {

        // declarations
        String token = "";
        int oneBoyOneGirl = 0;
        int twoBoys = 0;
        int twoGirls = 0;
        File fileName = new File("test2.txt");
        Scanner inFile = new Scanner(fileName);

        // process file
        while (inFile.hasNext()) {
            token = inFile.next();
            if (token.equals("BG") || token.equals("GB"))
                oneBoyOneGirl++;
            else if (token.equals("GG"))
                twoGirls++;
            else
                twoBoys++;
        }
        int total = oneBoyOneGirl + twoBoys + twoGirls;

        // print
        System.out.println("Composition statistics for families with two children.");
        System.out.println("\nTotal number of families: " + total);
        System.out.println("\nNumber of families with");
        System.out.print("\t\t   2 boys: " + twoBoys);
        System.out.println("\trepresents " + percentageCalculation(twoBoys, total) + "%");
        System.out.print("\t\t  2 girls: " + twoGirls);
        System.out.println("\trepresents " + percentageCalculation(twoGirls, total) + "%");
        System.out.print("1 boy and 1 girls: " + oneBoyOneGirl);
        System.out.print("\trepresents " + percentageCalculation(oneBoyOneGirl, total) + "%");
    }
}