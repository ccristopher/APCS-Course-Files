public class test {
    public static void main(String[] args) {
        int x = 3;
        int y = 2;
        int z = 1;
        if ( x / y > 1 )
        {
            if ( x / z > 1 )
                System.out.println( x );
            else
                System.out.println( z );
        }
        else if ( y / z > 1 )
        {
            System.out.println( y );
        }
        else
            System.out.println( z );
    }
}