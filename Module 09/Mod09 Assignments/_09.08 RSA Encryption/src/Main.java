import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a lower limit: ");
        int lowerLimit = input.nextInt();
        input.nextLine();
        System.out.print("enter an upper limit: ");
        int upperLimit = input.nextInt();
        input.nextLine();
        PrimeList primeList = new PrimeList(lowerLimit, upperLimit);
        System.out.println(primeList.getPrimeList());
    }
}