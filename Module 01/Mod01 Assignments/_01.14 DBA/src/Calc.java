public class Calc
{
    public static void main(String[] args)
    {
        int value = 7;
        //calculation and output statements
        System.out.println("The original value is " + value + ".");
        System.out.println("When " + value + " is divided by 2, the whole number result is " + value / 2 + ".");
        System.out.println("The remainder of " + value + " divided by 2 is " + value % 2 + ".");
        System.out.print("When " + value + " is divided by 2, the decimal result is " + (double) value / 2 + ".");
    }
}