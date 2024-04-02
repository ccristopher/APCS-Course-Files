public class CatapultTester {
    public static void main(String[] args) {
        int[] speedArray = {20, 25, 30, 35, 40, 45, 50};

        int[] angleArray = {25, 30, 35, 40, 45, 50};

        double[][] twoDimArray = new double[7][6];

        Catapult melon = new Catapult();
        System.out.println(melon.calcDistance(20, 25));

        for(int row = 0; row < twoDimArray.length; row ++)
        {
            for(int col = 0; col < twoDimArray[row].length; col ++)
            {
                twoDimArray[row][col] = melon.calcDistance(speedArray[row], angleArray[col]);
            }
        }

        printResults(speedArray, angleArray, twoDimArray);
    }

    public static void printResults(int[] speedArray, int[] angleArray, double[][] twoDimArray) {
        for(int row = 0; row < twoDimArray.length; row ++)
        {
            System.out.printf("%s", speedArray[row]);

            for(int col = 0; col < twoDimArray[row].length; col ++)
            {
                System.out.printf("%10.0f", twoDimArray[row][col]);
            }
            System.out.println();
        }
    }
}
