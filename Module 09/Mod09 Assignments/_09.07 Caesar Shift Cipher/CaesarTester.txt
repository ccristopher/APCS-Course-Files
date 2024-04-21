/**
 * This class runs a Caesar Shifter
 *
 * @author Cristopher Encarnacion
 * @version 04/20/2024
 */

import java.util.Scanner;

public class CaesarTester {
    public static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final Scanner INPUT = new Scanner(System.in);
    public static int shiftKey;
    private static boolean i = true;

    public static void main(String[] args) {
        System.out.print("Declare a shift key (0-25): ");
        menu1();

        while(i) {
            System.out.print("\nType the letter [e] for encryption, [d] for decryption, or [x] to quit: ");
            menu2();
        }
    }

    public static void menu1() {
        shiftKey = INPUT.nextInt();
        INPUT.nextLine();

        if (shiftKey < 0 || shiftKey > 25) { // check if shiftkey is between 0 and 25. if not restart menu
            System.out.println("INVALID");
            menu1();
        }
    }

    public static void menu2() {
        String temp = INPUT.nextLine();

        if (temp.equalsIgnoreCase("e")) {
            System.out.print("Cipher Alphabet: ");
            Encryption.getCipher();
            System.out.print("\nEnter a plaintext message: ");
            Encryption.encrypt(INPUT.nextLine());
        }
        else if (temp.equalsIgnoreCase("d")) {
            System.out.print("Decipher Alphabet: ");
            Decryption.getDecipher();
            System.out.print("\nEnter a plaintext message: ");
            Decryption.decrypt(INPUT.nextLine());
        }
        else if (temp.equalsIgnoreCase("x")) {
            i = false; // exit program if 'x'
        }
        else { // if not 'e', 'd', 'x', restart menu
            System.out.println("INVALID");
            menu2();
        }
    }
}