/**
 * Starter code for the Hurricane Tester
 * @author Cristopher Encarnacion
 * @version 02/29/24
 *
 */
 
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
public class HurricaneTester

{

    public static void main(String[] args) throws IOException
    {
        // read data from text file & put in an array
        File fileName = new File("hurricanedata.txt");
        Scanner inFile = new Scanner(fileName);
        int numValues = 0;
        
        // count number of lines in text file
        while (inFile.hasNextLine() )
        {
            inFile.nextLine();
            numValues++;
        }
        inFile.close();
        
        
        // initialize arrays based on lines counted in text file
        int [] years = new int[numValues];
        String [] months = new String[numValues];
        int [] pressures = new int[numValues];
        double [] windSpeeds = new double[numValues];
        String [] names = new String[numValues];
        int [] categories = new int[numValues];

        // read and assign data from text file to the arrays
        inFile = new Scanner(fileName);
        int index = 0;
        while(inFile.hasNext() )
        {
            years[index] = inFile.nextInt();
            months[index] = inFile.next();
            pressures[index] = inFile.nextInt();
            windSpeeds[index] = inFile.nextDouble();
            names[index] = inFile.next();
            index++;
        }
        inFile.close();

        // create a Hurricane ArrayList
        ArrayList<Hurricane> storms = new ArrayList<Hurricane>();
        for (int x = 0; x < numValues; x++) {
            storms.add(new Hurricane(years[x], names[x], months[x], categories[x], pressures[x], windSpeeds[x]));
        }

        // user input begins
        Scanner in = new Scanner(System.in);
        int yearBegin = Integer.MIN_VALUE;
        int yearEnd = Integer.MAX_VALUE;

        // get valid start year
        boolean valid = false;
        while (!valid) {
            System.out.println("Please provide the year you want the data set range to begin:");
            yearBegin = in.nextInt();
            if (yearBegin < years[0]) {
                System.out.println("Please choose a year greater than " + years[0] + "!");
            }
            else if (yearBegin > years[numValues - 1]) {
                System.out.println("Please choose a year lower than " + years[numValues - 1] + "!");
            }
            else valid = true;
        }

        // get valid end year
        valid = false;
        while (!valid) {
            System.out.println("Please provide the year you want the data set range to end:");
            yearEnd = in.nextInt();
            if (yearEnd < years[0]) {
                System.out.println("Please choose a year greater than " + years[0] + "!");
            }
            else if (yearEnd > years[numValues - 1]) {
                System.out.println("Please choose a year lower than " + years[numValues - 1] + "!");
            }
            else valid = true;
        }

        // bunch of variables
        double averageCat;
        double averagePressure;
        double averageWindspeed;
        int numCat1 = 0;
        int numCat2 = 0;
        int numCat3 = 0;
        int numCat4 = 0;
        int numCat5 = 0;

        int minCat = Integer.MAX_VALUE;
        int minPressure = Integer.MAX_VALUE;
        double minWindspeed = Double.MAX_VALUE;

        int maxCat = Integer.MIN_VALUE;
        int maxPressure = Integer.MIN_VALUE;
        double maxWindspeed = Double.MIN_VALUE;

        int newNumValues = 0;
        double total = 0;

        // adjust windspeed and calculate storm categories
        for (int x = 0; x < numValues; x++) {
            if (years[x] >= yearBegin && years[x] <= yearEnd) {
                windSpeeds[x] *= 1.151; // convert knots to mph

                // find hurricane category
                if (windSpeeds[x] <= 95) {
                    categories[x] = 1;
                    numCat1++;
                }
                else if (windSpeeds[x] <= 110) {
                    categories[x] = 2;
                    numCat2++;
                }
                else if (windSpeeds[x] <= 129) {
                    categories[x] = 3;
                    numCat3++;
                }
                else if (windSpeeds[x] <= 156) {
                    categories[x] = 4;
                    numCat4++;
                }
                else {
                    categories[x] = 5;
                    numCat5++;
                }

                // update statistics
                total += categories[x];
                if (categories[x] < minCat) {
                    minCat = categories[x];
                }
                if (categories[x] > maxCat) {
                    maxCat = categories[x];
                }
                newNumValues++;
            }
        }
        averageCat = total / newNumValues;

        // average calculations
        total = 0;
        for (int x = 0; x < numValues; x++) {
            if (years[x] >= yearBegin && years[x] <= yearEnd) {
                total += pressures[x];
                if (pressures[x] < minPressure) {
                    minPressure = pressures[x];
                }
                if (pressures[x] > maxPressure) {
                    maxPressure = pressures[x];
                }
            }
        }
        averagePressure = total / newNumValues;

        total = 0;
        for (int x = 0; x < numValues; x++) {
            if (years[x] >= yearBegin && years[x] <= yearEnd) {
                total += windSpeeds[x];
                if (windSpeeds[x] < minWindspeed) {
                    minWindspeed = windSpeeds[x];
                }
                if (windSpeeds[x] > maxWindspeed) {
                    maxWindspeed = windSpeeds[x];
                }
            }
        }
        averageWindspeed = total / newNumValues;

        // create table header
        System.out.println("                      Hurricanes " + yearBegin + " - " + yearEnd);
        System.out.println();
        System.out.println(" Year     Hurricane    Category     Pressure (mb)     Wind speed (mph)");
        System.out.println("=====================================================================");

        // output storm data
        for(Hurricane storm : storms) {
            if (storm.getYear() >= yearBegin && storm.getYear() <= yearEnd) {
                System.out.printf("%s %20.2f\n", storm.toString(), storm.getWindspeed());
            }
        }

        // output statistics
        System.out.println("=====================================================================");
        System.out.printf("%14s %10s %-3.1f %6s %6.1f %11s %6.2f\n", "Average:", "", averageCat, "", averagePressure,
                "", averageWindspeed);
        System.out.printf("%14s %10s %-3d %4s %6d %13s %6.2f\n", "Minimum:", "", minCat, "", minPressure, "",
                minWindspeed);
        System.out.printf("%14s %10s %-3d %4s %6d %13s %6.2f\n", "Maximum:", "", maxCat, "", maxPressure, "",
                maxWindspeed);

        System.out.println("\nSummary of Categories:");
        System.out.println("   Cat 1: " + numCat1);
        System.out.println("   Cat 2: " + numCat2);
        System.out.println("   Cat 3: " + numCat3);
        System.out.println("   Cat 4: " + numCat4);
        System.out.print("   Cat 5: " + numCat5);
    }
}