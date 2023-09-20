/**
 * Without modifying any of the method signatures, correct add method calls to the
 * already created methods in the main() below
 *
 * APCS Team 2020 (Edited by: Cristopher Encarnacion)
 *
 * 09/19/2023
 */
public class MakingMethodCalls1
{
    public static void addTheseTwo()
    {
        System.out.println("Ten plus five equals " + (10 + 5));
    }

    public static void multiplyTheseTwo(int a, int b)
    {
        System.out.println("Ten times five equals " + (a * b));
    }

    public static int divideTheseTwo(int a, int b)
    {
        return (a / b);
    }

    public static void main(String[] args)
    {
        // declare local variables
        int x = 10;
        int y = 5;

        // add variables & print
        addTheseTwo();

        // multiply variables & print
        multiplyTheseTwo(x, y);

        // divide variables & print
        System.out.print("Ten divided by five equals " + (divideTheseTwo(x, y)));

    }
}