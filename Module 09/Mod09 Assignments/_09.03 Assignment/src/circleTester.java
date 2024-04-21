/**
 * This class tests Circle classes.
 *
 * @author Cristopher Encarnacion
 * @version 04/17/2024
 */

import java.util.ArrayList;


public class circleTester {
    public static void main(String[] args) {
        ArrayList<Circle2> circles = new ArrayList<Circle2>();

        circles.add(new Circle2(2, 4, 2));
        circles.add(new Cylinder2(10, 15, 2, 4));
        circles.add(new Oval2(25, 10, 3, 5));
        circles.add(new OvalCylinder2(40, 10, 3, 5, 4));

        for(Circle2 c : circles) {
            showCenter(c);
        }
    }

    public static void showCenter(Circle2 c) {
        System.out.println("For this " + c.getName() + " the " + c.getCenter());
    }
}
