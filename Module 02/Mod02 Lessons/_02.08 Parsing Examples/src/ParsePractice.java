/**
 * Without modifying any of the method signatures, correct add method calls to the already created methods in the main() below
 *
 * APCS Team 2020 (Edited by: )
 *
 */
    public class ParsePractice

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
        int x = 10;
        int y = 5;

        addTheseTwo();

        multiplyTheseTwo(x, y);

        System.out.print("Ten divided by five equals " + (divideTheseTwo(x, y)));


    }//end of main method
}//end of class