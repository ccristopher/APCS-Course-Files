/**
 * This class finds a fibonacci number off int input
 *
 * @author Cristopher Encarnacion
 * @version 04/25/2024
 */

public class Fibonacci {
    public static int findNumber(int n) {
        if (n == 0 || n == 1)
            return n;

        return findNumber(n - 1) + findNumber(n - 2);
    }
}