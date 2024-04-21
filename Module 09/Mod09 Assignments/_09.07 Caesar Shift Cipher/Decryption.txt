/**
 * This class decrypts a message
 *
 * @author Cristopher Encarnacion
 * @version 04/20/2024
 */

public class Decryption {
    public static String decrypt(String message) {
        String m = message.toUpperCase();
        String newM = "";

        for (int i = 0; i < m.length(); i++) {
            int c = m.charAt(i); // convert character to ascii

            if (c < 65 || c > 90) { // if c isn't in the alphabet than just leave it alone
                newM += (char) c;
            }
            else {
                newM += (char) ((c - 65 - CaesarTester.shiftKey + 26) % 26 + 65); // shift
            }
        }

        System.out.println(newM);
        return newM;
    }

    public static void getDecipher() {
        decrypt(CaesarTester.ALPHABET);
    }
}