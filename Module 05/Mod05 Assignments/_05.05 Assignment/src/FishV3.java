/**
 * FishV3 object
 *
 * @author Cristopher Encarnacion
 * @version 12/12/2023
 */

public class FishV3 {
    private double myPosition;
    private double mySpeed;
    private int myOffspring;

    public FishV3(double position, double speed, int offspring) {
        myPosition = position;
        mySpeed = speed;
        myOffspring = offspring;
    }

    public double swim() {
        // update fish's position based on speed and time (24 hours)
        myPosition = myPosition + mySpeed * 24;

        return myPosition;
    }

    public int breed() {
        // generate a random number of offspring between 1 and 50 and add it to existing offspring
        myOffspring += (int) (Math.random() * 50 + 1);

        return myOffspring;
    }
}