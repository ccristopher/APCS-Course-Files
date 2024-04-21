import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] rowH = {2,11,6,5};
        int[] colH = {3,6,9,4};
        int[][] values = calcMagicMath(rowH, colH);
        for(int row = 0; row < values.length; row++) {
            for (int col = 0; col < values[row].length; col++) {
                System.out.print(values[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println(oddNumbers(values));
    }

//    public static int[][] calcMagicMath (int[] rowH, int[] colH) {
//        int temp = (int) (Math.random() * 27 + 3);
//        int[][] magicMath = new int[rowH.length][colH.length + 1];
//        for (int col = 0; col <= colH.length; col++) {
//            for (int row = 0; row < rowH.length; row++) {
//                if (col == colH.length) {
//                    magicMath[row][col] = rowH[row] * temp;
//                }
//                else {
//                    magicMath[row][col] = rowH[row] * colH[col];
//                }
//            }
//        }
//        return magicMath;
//    }

    public static int[][] calcMagicMath (int[] rowH, int[] colH) {
        int temp = (int) (Math.random() * 27 + 3);
        int[][] magicMath = new int[rowH.length][colH.length + 1];
        for (int col = 0; col < magicMath[0].length; col++) {
            for (int row = 0; row < magicMath.length; row++) {
                if (col == magicMath[0].length - 1) {
                    magicMath[row][col] = rowH[row] * temp;
                }
                else {
                    magicMath[row][col] = rowH[row] * colH[col];
                }
            }
        }
        return magicMath;
    }

    public static ArrayList<Integer> oddNumbers(int[][] twoD) {
        ArrayList<Integer> temp = new ArrayList<>();

        for (int row = twoD.length - 1; row > -1; row--) {
            for (int col = 0; col < twoD[0].length; col++) {
                if (twoD[row][col] % 2 != 0) {
                    temp.add(twoD[row][col]);
                }
            }
        }
        return temp;
    }
}