/**
 * The Calculations class performs addition, subtraction,
 * multiplication, division, and modulus operations on integers and
 * decimals.
 *
 * @ Cristopher Encarnacion
 * @ September 15, 2023
 */
public class CalculationsV6
{
    public static void main(String[] args)
    {
        // Declare integer variables
        int iNum1 = 25;
        int iNum2 = 9;
        int iNum3 = 11;
        int iNum4 = 9;
        int iNum5 = 25;
        int iNum6 = 25;
        int iNum7 = 9;
        int iNum8 = 9;
        int iNum9 = 25;
        int iNum10 = 11;
        int iNum11 = 9;
        int iNum12 = 2;
        int iNum13 = 9;
        int iNum14 = 24;
        int iNum15 = 87;
        int iNum16 = 17;
        int iNum17 = 4;
        int iNum18 = 43;
        int iNum19 = 8;
        int iNum20 = 3;

        // Declare double variables
        double dNum1 = 43.21;
        double dNum2 = 3.14;
        double dNum3 = 3.14;
        double dNum4 = 10.0;
        double dNum5 = 3.14;
        double dNum6 = 10.0;
        double dNum7 = 10.0;
        double dNum8 = 43.21;
        double dNum9 = 10.0;
        double dNum10 = 10.0;
        double dNum11 = 3.14;
        double dNum12 = 7.60;
        double dNum13 = 1.45;
        double dNum14 = 8.39;
        double dNum15 = 9.93;
        double dNum16 = 0.67;
        double dNum17 = 2.58;
        double dNum18 = 1.55;
        double dNum19 = 7.50;
        double dNum20 = 4.32;

        // Addition
        System.out.println("Addition");
        System.out.print(iNum1 + " + " + iNum2 + " = ");
        System.out.println(iNum1 + iNum2);
        System.out.print(dNum1 + " + " + dNum2 + " = ");
        System.out.println(dNum1 + dNum2);
        System.out.println();

        // Subtraction
        System.out.println("Subtraction");
        System.out.print(iNum3 + " - " + iNum4 + " - " + iNum5 + " = ");
        System.out.println(iNum3 - iNum4 - iNum5);
        System.out.print(dNum3 + " - " + dNum4 + " = ");
        System.out.println(dNum3 - dNum4);
        System.out.println();

        // Multiplication
        System.out.println("Multiplication");
        System.out.print(iNum6 + " * " + iNum7 + " = ");
        System.out.println(iNum6 * iNum7);
        System.out.print(dNum5 + " * " + dNum6 + " * " + dNum7 + " = ");
        System.out.println(dNum5 * dNum6 * dNum7);
        System.out.println();

        // Division
        System.out.println("Division");
        System.out.print(iNum8 + " / " + iNum9 + " = ");
        System.out.println(iNum8 / iNum9);
        System.out.print(dNum8 + " / " + dNum9 + " = ");
        System.out.println(dNum8 / dNum9);
        System.out.println();

        // Modulus operator
        System.out.println("Modulus");
        System.out.print(iNum10 + " % " + iNum11 + " = ");
        System.out.println(iNum10 % iNum11);
        System.out.print(dNum10 + " % " + dNum11 + " = ");
        System.out.println(dNum10 % dNum11);
        System.out.println();

        // 1.08 Additional int Equations
        System.out.println("Additional int Equations");
        System.out.print(iNum12 + " + " + iNum13 + " - " + iNum14 + " = ");
        System.out.println(iNum12 + iNum13 - iNum14);
        System.out.print(iNum15 + " * " + iNum16 + " / " + iNum17 + " = ");
        System.out.println(iNum15 * iNum16 / iNum17);
        System.out.print(iNum18 + " + " + iNum19 + " % " + iNum20 + " = ");
        System.out.println(iNum18 + iNum19 % iNum20);
        System.out.println();

        // 1.09 Additional double Equations
        System.out.println("Additional double Equations");
        System.out.print(dNum12 + " + " + dNum13 + " - " + dNum14 + " = ");
        System.out.println(dNum12 + dNum13 - dNum14);
        System.out.print(dNum15 + " * " + dNum16 + " / " + dNum17 + " = ");
        System.out.println(dNum15 * dNum16 / dNum17);
        System.out.print(dNum18 + " + " + dNum19 + " % " + dNum20 + " = ");
        System.out.println(dNum18 + dNum19 % dNum20);
    }
}