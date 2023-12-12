/**
 * Calculates a planets surface gravity based on its mass and diameter and prints
 * it in a table.
 *
 * @author Cristopher Encarnacion
 * @version 12/11/2023
 */
public class PlanetGravity {

    // method to calculate surface gravity
    public static double surfaceGravity(double mass, double diameter) {
        return 6.67e-11 * mass / Math.pow(diameter * 500, 2); // diameter * 500 converts km to m and diameter to radius
    }

    // method to print title for table
    public static void title() {
        // title string
        String title = "\t\t\t\t\tPlanetary Data\nPlanet\t\tDiameter (km)\t\tMass (kg)\t\tg (m/s^2)\n";

        // dashes
        for (int x = 0; x < 59; x++) {
            title += "-";
        }
        System.out.println(title);
    }

// method to print data for a planet
    public static void data(String name, double diameter, double mass, double surfaceGravity) {
        System.out.print(name + "\t\t\t" + diameter + "\t\t\t" + mass + "\t\t\t" + Math.round(surfaceGravity * 100) / 100.0);
    }

    public static void main(String[] args) {
        String name = "Mars";
        double diameter = 6794.0;
        double mass = 6.4219e23;
        title();
        data(name, diameter, mass, surfaceGravity(mass, diameter));
    }
}