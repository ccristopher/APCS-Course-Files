/**
 * This class manages a list of prime numbers given a range.
 *
 * @author Cristopher Encarnacion
 * @version 04/21/2024
 */

import java.util.ArrayList;

public class PrimeList {
    private final ArrayList<Integer> primeList = new ArrayList<>();
    private int upperLimit = 100; // default values
    private int lowerLimit = 0;

    // constructors
    public PrimeList(int upperLimit) {
        this.upperLimit = upperLimit;
        getPrimeList(); // update list
    }

    public PrimeList(int lowerLimit, int upperLimit) {
        this.upperLimit = upperLimit;
        this.lowerLimit = lowerLimit;
        getPrimeList(); // update list
    }

    // check if a number is prime
    private boolean isPrime(int n) {
        if(n<=1) {
            return false;
        }

        for(int i=2; i<=n/2; i++) {
            if((n % i == 0)) {
                return false;
            }
        }

        return true;
    }

    // getters and setters
    public ArrayList<Integer> getPrimeList() {
        if (primeList.isEmpty()) { // generate primeList if its empty
            for (int i = lowerLimit; i <= upperLimit; i++) {
                if (isPrime(i)) {
                    primeList.add(i);
                }
            }
        }
        return primeList;
    }

    public int getUpperLimit() {
        return upperLimit;
    }

    public int getLowerLimit() {
        return lowerLimit;
    }

    public void setLowerLimit(int lowerLimit) {
        this.lowerLimit = lowerLimit;
        primeList.clear();
        getPrimeList();
    }

    public void setUpperLimit(int upperLimit) {
        this.upperLimit = upperLimit;
        primeList.clear();
        getPrimeList();
    }
}