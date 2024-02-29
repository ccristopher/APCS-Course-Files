import java.util.ArrayList;
public class hi {
    public static int arrayProduct() {
        int[] array = new int[5];
        array[0] = 2;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 11;

        int product = 1;
        for(int n : array) {
            product *= n;
        }
        return product;
    }
    public static String isSimilar(int side1, int side2, int side1B, int side2B) {
        if((double) side1 / side2 == (double) side1B / side2B) {
            return "The triangles are similar";
        }
        return "The triangles are not similar";
    }
    public static double averageScore() {
        double[] scores = new double[] {24.6, 25.2, 22.4, 27.4, 32.2, 20.3, 21.4};
        double max = 0;
        double min = 999;
        for(int n = 0; n <= scores.length - 1; n++) {
            if(scores[n] < min) {
                min = scores[n];
            }
            if(scores[n] > max) {
                max = scores[n];
            }
        }
        System.out.println(min);
        System.out.println(max);
        double sum = 0 - max - min;
        for(double d : scores) {
            sum += d;
        }
        System.out.println(sum);
        return sum / (scores.length - 2);
    }

    public static void main(String[] args) {
        System.out.println(arrayProduct());
        double[] a1 = new double[] {1.2, 2.3, 3.4, 4.5, 5.6};
        double[] a2 = new double[] {1.0, 2.0, 3.0, 4.0, 5.0};
        double[] a3 = new double[a1.length];

        for(int n = 0; n <= a1.length - 1; n++) {
            a3[n] = a1[n] * a2[n];
            System.out.println(a3[n]);
        }
        System.out.println(isSimilar(2, 3, 8, 12));
        System.out.println(averageScore());
    }
}
