/**
 * This program does basic arithmetic
 *
 *
 * @author Cristopher Encarnacion
 * @version 09/25/23
 */
public class Calcv2
{
    public static void main(String[] args)
    {
        int value1 = 7;
        int value2 = 2;
        //calculation and output statements
        System.out.println("The original value is " + value1 + ".");
        System.out.println("When " + value1 + " is divided by " + value2 + ", the whole number result is " + value1 / value2 + ".");
        System.out.println("The remainder of " + value1 + " divided by " + value2 + " is " + value1 % value2 + ".");
        System.out.print("When " + value1 + " is divided by " + value2 + ", the decimal result is " + (double) value1 / value2 + ".");
    }
}