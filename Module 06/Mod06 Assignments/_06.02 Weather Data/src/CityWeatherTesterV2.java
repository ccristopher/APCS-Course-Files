/**
 * Annual Weather client class
 *
 * @author APCS Team
 * @version Today
 */
import java.util.Scanner;
public class CityWeatherTesterV2
{
    // method to print results (formatting output will be done in 6.02)
    public static void printResults(String city, String state, String[] month, double[] temperature, double[] precipitation, String tempLabel, String precipLabel, double tempAverage, double precipTotal) {
        //Output: display table of weather data including average and total
        System.out.println();
        System.out.println("           Weather Data");
        System.out.println("      Location: " + city +", " + state);
        System.out.println("Month     Temperature (" +  tempLabel + ")     Precipitation (" + precipLabel + ")");
        System.out.println();
        System.out.println("***************************************************");
        //Output: display table of weather data including average and total
        for( int index = 0; index < temperature.length; index++) {
            System.out.printf("%5s", month[index] + ".");
            System.out.printf("%14.1f", temperature[index]);
            System.out.printf("%19.1f\n", precipitation[index]);
        }
        System.out.println("***************************************************");
        System.out.printf("      Average: %.1f", tempAverage);
        System.out.printf("     Total: %.1f", precipTotal);
    }

    public static void main (String [ ] args)
    {

        //Declare and initialize variables
        Scanner in = new Scanner(System.in);  //will be used in 6.02
        String city = "Miami";  //choose a city from the table provided
        String state = "Florida";  //choose a city from the table provided

        String [] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};     //complete initialization of months array
        double [] temperature ={68.1, 69.1, 72.4, 75.7, 79.6, 82.4, 83.7, 83.6, 82.4, 78.8, 74.4, 69.9};     //complete initialization of temperatures array
        double [] precipitation ={1.9, 2.1, 2.6, 3.4, 5.5, 8.5, 5.8, 8.6, 8.4, 6.2, 3.4, 2.2};     //complete initialization of precipitation array

        String tempLabel = "F";    //initialize to F
        String precipLabel = "in."; //initialize to in
        String tempScale;
        String precipScale;
        double tempAverage;
        double precipTotal;

        //instantiate CityWeatherV1 object
        CityWeatherV2 miami = new CityWeatherV2(month, temperature, precipitation);
        //print average temperature and total precipitation
        System.out.println(miami.temperatureAverage());
        System.out.println(miami.precipitationTotal());
        //input to decide F/C and in/cm - to be completed in 6.02
        System.out.print("Choose the temperature scale (F = Fahrenheit, C = Celcius): ");
        tempScale = in.next();
        System.out.print("Choose the precipitation scale (i = inches, c = centimeters): ");
        precipScale = in.next();
        //conditions & method call to convert temp, if needed - to be completed in 6.02
        if(tempScale.equalsIgnoreCase("C")) {
            miami.celcius();
            tempLabel = "C";
        }
        //conditions & method call to convert prec, if needed - to be completed in 6.02
        if(precipScale.equalsIgnoreCase("c")) {
            miami.centimeters();
            precipScale = "cm.";
        }
        //method call to calculate the average temperature
        tempAverage = miami.temperatureAverage();
        //method call to calculate the total precipitation
        precipTotal = miami.precipitationTotal();
        //method call to print results (hint: Need parameters for month, temperature, precipitation arrays, data labels and the average temperature, total precipitation variables)
        printResults(city, state, month, temperature, precipitation, tempLabel, precipLabel, tempAverage, precipTotal);
    }//end main
}//end class

