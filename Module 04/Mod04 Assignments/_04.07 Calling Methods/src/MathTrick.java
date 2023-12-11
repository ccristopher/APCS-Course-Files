/**
 *
 * @author FLVS AP CSA team
 * @version 2021
 *
 * This Math trick and many more can be found at:
 *
 */

public class MathTrick {

    // Create random 3-digit number so that the first and third digits differ by more than one
    public static int getRandomNum()
    {
        int num = 0;
        int firstDigit = 0;
        int lastDigit = 0;
        num = (int) (Math.random() * 900 + 100);
        firstDigit = num / 100;
        lastDigit = num % 10;
        while (Math.abs(firstDigit - lastDigit) < 2) {
            num = (int) (Math.random() * 900 + 100);
            firstDigit = num / 100;
            lastDigit = num % 10;
        }
        return num;
    }

    // Reverse digits
    public static int reverseDigits (int num) {
        int reversed = 0;
        while (num > 0) {
            reversed *= 10;
            reversed += num % 10;
            num /= 10;
        }
        return reversed;
    }

    // Reverse strings
    public static String reverseString(String str) {
        String reversed = "";
        for (int i = 0; i < str.length(); i++) {
            reversed = str.charAt(i) + reversed;
        }
        return reversed;
    }

        public static void main(String[] args)
    {
        int num = getRandomNum();
        String answer;

        System.out.println("1. The starting number: " + num);

        num = reverseDigits(num);
        System.out.println("2. The reversed number: " + num);

        num = Math.abs(num - reverseDigits(num));
        System.out.println("3. The difference is: " + num);

        num = num + reverseDigits(num);
        System.out.println("4. The reversed number added to difference: " + num);

        num = num * 1000000;
        System.out.println("5. Number x one million: " + num);

        answer = String.valueOf(num - 733361573);
        System.out.println("6. Number subtracted and converted to String: " + answer);

        // Replace each digit with the letter it corresponds to
        for (int i = 0; i < answer.length(); i++) {
            if (answer.charAt(i) == '0')
                answer = answer.replace('0', 'Y');
            else if (answer.charAt(i) == '1')
                answer = answer.replace('1', 'M');
            else if (answer.charAt(i) == '2')
                answer = answer.replace('2', 'P');
            else if (answer.charAt(i) == '3')
                answer = answer.replace('3', 'L');
            else if (answer.charAt(i) == '4')
                answer = answer.replace('4', 'R');
            else if (answer.charAt(i) == '5')
                answer = answer.replace('5', 'O');
            else if (answer.charAt(i) == '6')
                answer = answer.replace('6', 'F');
            else if (answer.charAt(i) == '7')
                answer = answer.replace('7', 'A');
            else if (answer.charAt(i) == '8')
                answer = answer.replace('8', 'I');
            else if (answer.charAt(i) == '9')
                answer = answer.replace('9', 'B');
        }
        System.out.println("7. Replaced string: " + answer);

        answer = reverseString(answer);
        System.out.print("8. Reversed string: " + answer);

    }
}