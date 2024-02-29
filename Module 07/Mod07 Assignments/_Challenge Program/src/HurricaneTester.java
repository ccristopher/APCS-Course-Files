/**
 * Starter code for the Hurricane Tester
 * APCS Team 2020
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
        //read data from text file & put in an array
        File fileName = new File("hurricanedata.txt");
        Scanner inFile = new Scanner(fileName);
        int numValues = 0;
        
        //count number of lines in text file
        while (inFile.hasNextLine() )
        {
            inFile.nextLine();
            numValues++;
        }
        inFile.close();
        
        
        //initialize arrays based on lines counted in text file
        int [] years = new int[numValues];
        String [] months = new String[numValues];
        int [] pressures = new int[numValues];
        double [] windSpeeds = new double[numValues];
        String [] names = new String[numValues];
        int [] categories = new int[numValues];

        //read and assign data from text file to the arrays
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
        
        //convert the windspeed, determine categories, calculate sums
        for (int x = 0; x < numValues; x++) {
            windSpeeds[x] *= 1.151;

            if (windSpeeds[x] <= 95) {
                categories[x] = 1;
            }
            else if (windSpeeds[x] <= 110) {
                categories[x] = 2;
            }
            else if (windSpeeds[x] <= 129) {
                categories[x] = 3;
            }
            else if (windSpeeds[x] <= 156) {
                categories[x] = 4;
            }
            else {
                categories[x] = 5;
            }
        }
        
        //create a Hurricane ArrayList using the data above
        ArrayList<Hurricane> storms = new ArrayList<Hurricane>();
        for (int x = 0; x < numValues; x++) {
            storms.add(new Hurricane(years[x], names[x], months[x], categories[x], pressures[x], windSpeeds[x]));
        }
        
        //user prompted for range of years
        Scanner in = new Scanner(System.in);
        int yearBegin = Integer.MIN_VALUE;
        int yearEnd = Integer.MAX_VALUE;

        boolean valid = false;
        while (!valid) {
            System.out.println("Please provide the year you want the data set range to begin.");
            yearBegin = in.nextInt();
            if (yearBegin < years[0]) {
                System.out.println("Please choose a year greater than " + years[0] + "!");
            }
            else if (yearBegin > years[numValues - 1]) {
                System.out.println("Please choose a year lower than " + years[numValues - 1] + "!");
            }
            else valid = true;
        }

        valid = false;
        while (!valid) {
            System.out.println("Please provide the year you want the data set range to end.");
            yearEnd = in.nextInt();
            if (yearEnd < years[0]) {
                System.out.println("Please choose a year greater than " + years[0] + "!");
            }
            else if (yearEnd > years[numValues - 1]) {
                System.out.println("Please choose a year lower than " + years[numValues - 1] + "!");
            }
            else valid = true;
        }

        double averageYear;
        double averagePressure;
        double averageWindspeed;

        int minYear = Integer.MAX_VALUE;
        int minPressure = Integer.MAX_VALUE;
        double minWindspeed = Double.MAX_VALUE;

        int maxYear = Integer.MIN_VALUE;
        int maxPressure = Integer.MIN_VALUE;
        double maxWindspeed = Double.MIN_VALUE;

        int newNumValues = 0;
        double total = 0;

        for (int x = 0; x < numValues; x++) {
            if (years[x] >= yearBegin && years[x] <= yearEnd) {
                total += years[x];
                if (years[x] < minYear) {
                    minYear = years[x];
                }
                if (years[x] > maxYear) {
                    maxYear = years[x];
                }
                newNumValues++;
            }
        }
        averageYear = total / newNumValues;

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

        System.out.println("                      Hurricanes 2003 - 2005");
        System.out.println();
        System.out.println(" Year     Hurricane    Category     Pressure (mb)     Wind speed (mph)");
        System.out.println("=====================================================================");
        for(Hurricane storm : storms) {
            if (storm.getYear() >= yearBegin && storm.getYear() <= yearEnd) {
                System.out.printf("%s %20.2f\n", storm.toString(), storm.getWindspeed());
            }
        }
        System.out.println("=====================================================================");
        System.out.printf("%14s %11s\n %-3.1f", "Average:", "", );
        System.out.printf("%14s", "Minimum:");
        System.out.printf("%14s", "Maximum:");
    }
}