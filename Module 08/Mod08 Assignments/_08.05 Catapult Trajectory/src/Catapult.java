/**
 * Catapult object that can be launched.
 *
 * @author Cristopher Encarnacion
 * @version 04/04/2024
 */

public class Catapult {
    public Catapult() {
    }

    public double calcDistance(int speed, int angle) { // takes in MPH and returns Ft
        return Math.pow(speed / 2.237, 2) * Math.sin(2 * Math.toRadians(angle)) / 9.81 * 3.281;
    }
}