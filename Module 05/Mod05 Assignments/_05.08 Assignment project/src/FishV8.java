/**
 * FishV8 object
 *
 * @author Cristopher Encarnacion
 * @version 12/12/2023
 */

public class FishV8 {
    // private instance variables
    private String myName;
    private double myPosition, mySpeed;
    private int myOffspring;

    // default constructor
    public FishV8() {

    }

    // overloaded constructors
    public FishV8(String name, double speed) {
        myName = name;
        myPosition = 0.0;
        mySpeed = speed;
        myOffspring = 0;
    }

    public FishV8(String name, double position, double speed, int offspring) {
        myName = name;
        myPosition = position;
        mySpeed = speed;
        myOffspring = offspring;
    }

    // overloaded methods that updates fish's position based on speed and time (24 hours)
    public void swim(double speed, double position) {
        myPosition = position + speed * 24;
    }

    public void swim() {
        myPosition += mySpeed * 24;
    }

    // overloaded methods that breed the fish
    public void breed(int offspring) {
        // generate a random number of offspring between 1 and 50 and add it to existing offspring
        myOffspring = offspring + (int) (Math.random() * 50 + 1);
    }

    public void breed() {
        myOffspring += (int) (Math.random() * 50 + 1);
    }

    // getters
    public String getMyName() {
        return myName;
    }

    public double getMyPosition() {
        return myPosition;
    }

    public double getMySpeed() {
        return mySpeed;
    }

    public int getMyOffspring() {
        return myOffspring;
    }

    // setters
    public void setMyName(String name) {
        myName = name;
    }

    public void setMyPosition(double position) {
        myPosition = position;
    }

    public void setMySpeed(double speed) {
        mySpeed = speed;
    }

    public void setMyOffspring(int offspring) {
        myOffspring = offspring;
    }
}