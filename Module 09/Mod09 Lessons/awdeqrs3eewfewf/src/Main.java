import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[]{ 2043, 131, 2, 23, 55 };
        int target = 23;
        int low = -1, high = a.length, probe;
        while ( high - low > 1 )
        {
            probe = (high + low) / 2;
            if ( a[ probe ] > target )
                high = probe;
            else
                low = probe;
        }

        if ( low != -1 && a[ low ] == target )
            System.out.println(low);

        System.out.println(-1);
    }
}