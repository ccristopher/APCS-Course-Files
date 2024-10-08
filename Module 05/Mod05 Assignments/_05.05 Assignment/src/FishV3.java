/**
 * FishV3 object
 *
 * @author Cristopher Encarnacion
 * @version 12/12/2023
 */

public class FishV3 {
    public FishV3() {
    }

    public double swim(double position, double speed) {
        // update fish's position based on speed and time (24 hours)
        position += speed * 24;

        return position;
    }

    public int breed(int offspring) {
        // generate a random number of offspring between 1 and 50 and add it to existing offspring
        offspring += (int) (Math.random() * 50 + 1);

        return offspring;
    }
}