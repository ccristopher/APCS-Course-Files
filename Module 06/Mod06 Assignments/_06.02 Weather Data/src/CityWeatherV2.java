/**
 * Annual Weather object class
 *
 * @author APCS Team
 * @version Today
 */

public class CityWeatherV2 {
    // private instance variables - three arrays
    private String[] myMonth;
    private double[] myTemperature;
    private double[] myPrecipitation;

    // constructor with parameters
    public CityWeatherV2(String[] month, double[] temperature, double[] precipitation) {
        myMonth = month;
        myTemperature = temperature;
        myPrecipitation = precipitation;
    }
    // setters and getters for each private instance variable
    public String[] getMyMonth() {
        return myMonth;
    }
    public double[] getMyTemperature() {
        return myTemperature;
    }
    public double[] getMyPrecipitation() {
        return myPrecipitation;
    }
    public void setMyMonth(String[] month) {
        myMonth = month;
    }
    public void setMyTemperature(double[] temperature) {
        myTemperature = temperature;
    }
    public void setMyPrecipitation(double[] precipitation) {
        myPrecipitation = precipitation;
    }
    // method to calculate the average of temperature
    public double temperatureAverage() {
        double sum = 0;
        for(int n = 0; n < myTemperature.length; n++) {
            sum += myTemperature[n];
        }
        return sum / myTemperature.length;
    }
    // method to calculate total precipitation array
    public double precipitationTotal() {
        double sum = 0;
        for(int n = 0; n < myPrecipitation.length; n++) {
            sum += myPrecipitation[n];
        }
        return sum;
    }
    // method to calculate temperature in Celsius (current index of temperature array passed as a parameter) - to be completed in 6.02
    public void celcius() {
        for(int n = 0; n < myTemperature.length; n++) {
            myTemperature[n] = (myTemperature[n] - 32) * 5.0/9;
        }
    }
    // method to calculate precipitation in centimeters (current index of precipitation array passed as a parameter) - to be completed in 6.02
    public void centimeters() {
        for(int n = 0; n < myPrecipitation.length; n++) {
            myPrecipitation[n] = myPrecipitation[n] * 2.54;
        }
    }
}
