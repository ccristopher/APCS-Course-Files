/**
 * This program calculates the hypotenuse of two right triangles
 * with sides [5, 23)
 *
 * @author Cristopher Encarnacion
 * @version 09/18/23
 */
public class PyTheorem
{
    public static void main(String[] args)
    {
        // calculate and print triangle, side 1 side 2, and hypotenuse
        int triangle1Side1 = (int) (Math.random() * 18 + 5);
        int triangle1Side2 = (int) (Math.random() * 18 + 5);
        double triangle1Hypotenuse = Math.sqrt(Math.pow(triangle1Side1, 2) + Math.pow(triangle1Side2, 2));
        System.out.print("Triangle 1");
        System.out.print("\t\t\tSide 1: " + triangle1Side1);
        System.out.print("\t\t\tSide 2: " + triangle1Side2);
        System.out.println("\t\t\tHypotenuse: " + triangle1Hypotenuse);

        int triangle2Side1 = (int) (Math.random() * 18 + 5);
        int triangle2Side2 = (int) (Math.random() * 18 + 5);
        double triangle2Hypotenuse = Math.sqrt(Math.pow(triangle2Side1, 2) + Math.pow(triangle2Side2, 2));
        System.out.print("Triangle 1");
        System.out.print("\t\t\tSide 1: " + triangle2Side1);
        System.out.print("\t\t\tSide 2: " + triangle2Side2);
        System.out.print("\t\t\tHypotenuse: " + triangle2Hypotenuse);
    }
}