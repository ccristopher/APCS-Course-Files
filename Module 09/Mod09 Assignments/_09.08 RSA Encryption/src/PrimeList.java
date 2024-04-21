import java.lang.reflect.Array;
import java.util.ArrayList;

public class PrimeList {
    private ArrayList<Integer> primeList;
    private int upperLimit;
    private int lowerLimit = 0;

    public PrimeList(int upperLimit) {
        this.upperLimit = upperLimit;
        generatePrimeList();
    }

    public PrimeList(int lowerLimit, int upperLimit) {
        this.upperLimit = upperLimit;
        this.lowerLimit = lowerLimit;
        generatePrimeList();
    }

    public int getUpperLimit() {
        return upperLimit;
    }

    public int getLowerLimit() {
        return lowerLimit;
    }

    public ArrayList<Integer> getPrimeList() {
        return primeList;
    }

    private void generatePrimeList() {
        for (int i = lowerLimit; i <= upperLimit; i++) {
            if (isPrime(i)) {
                primeList.add(i);
            }
        }
    }

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
}