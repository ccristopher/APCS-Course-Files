/**
 * This class demonstrates the binary search with an array of objects.
 *
 * @author Cristopher Encarnacion
 * @version 03/28/24
 */

public class TestMusicV3 {
    public static void main(String[] args)
    {
        Music[] album = new Music[10];

        album[0] = new Music("Smells Like Teen Spirit", 1991,   "Nirvana");
        album[1] = new Music("Hey Ya!", 2003,   "Outkast");
        album[2] = new Music("Crazy in Love",  2003, "Beyoncé");
        album[3] = new Music("Bohemian Rhapsody", 1975, "Queen");
        album[4] = new Music("Purple Rain", 1984, "Prince");
        album[5] = new Music("Runaway", 2010,    "Kanye West");
        album[6] = new Music("Royals", 2011,    "Lorde");
        album[7] = new Music("B.O.B.",  2000, "Outkast");
        album[8] = new Music("Alright", 2015, "Kendrick Lamar");
        album[9] = new Music("Gasolina",  2010, "Daddy Yankee");

        printAlbum(album);

        System.out.println("\n\nSearching for Runaway: ");
        insertionTitle(album);
        binarySearchTitle(album, "Runaway");

        System.out.println("\n\nSearching for Magnetic: ");
        insertionTitle(album);
        binarySearchTitle(album, "Magnetic");

        System.out.println("\n\nSearching for 2010: ");
        insertionYear(album);
        binarySearchYear(album, 2010);

        System.out.println("\n\nSearching for 2024: ");
        insertionYear(album);
        binarySearchYear(album, 2024);

        System.out.println("\n\nSearching for Outkast: ");
        insertionArtist(album);
        binarySearchArtist(album, "Outkast");

        System.out.println("\n\nSearching for Illit: ");
        insertionArtist(album);
        binarySearchArtist(album, "Illit");
    }

    public static void printAlbum(Music[] a)
    {
        System.out.println("Title                     Year   Artist");
        System.out.println("-------------------------------------------------------");
        for(int i = 0; i < a.length; i++)
            System.out.println(a[i]);
    }

    public static void binarySearchTitle(Music[] r, String toFind )
    {
        int high = r.length;
        int low = -1;
        int probe;

        while( high - low > 1 )
        {
            probe = ( high + low ) / 2;

            if(r[probe].getTitle().compareTo(toFind) > 0)
                high = probe;
            else
            {
                low = probe;
                if( r[probe].getTitle().compareTo(toFind) == 0)
                {
                    break;
                }
            }
        }

        if( (low >= 0) && (r[low].getTitle().compareTo(toFind) == 0 ))
        {
            linearPrintTitle(r, low, toFind);
        }
        else
            System.out.println("NOT found: " + toFind);
    }

    public static void binarySearchYear(Music[] r, int toFind )
    {
        int high = r.length;
        int low = -1;
        int probe;

        while( high - low > 1 )
        {
            probe = ( high + low ) / 2;

            if(r[probe].getYear() > toFind)
                high = probe;
            else
            {
                low = probe;
                if(r[probe].getYear() == toFind)
                {
                    break;
                }
            }
        }

        if( (low >= 0) && (r[low].getYear() == toFind))
        {
            linearPrintYear(r, low, toFind);
        }
        else
            System.out.println("NOT found: " + toFind);
    }

    public static void binarySearchArtist(Music[] r, String toFind )
    {
        int high = r.length;
        int low = -1;
        int probe;

        while( high - low > 1 )
        {
            probe = ( high + low ) / 2;

            if(r[probe].getArtist().compareTo(toFind) > 0)
                high = probe;
            else
            {
                low = probe;
                if( r[probe].getArtist().compareTo(toFind) == 0)
                {
                    break;
                }
            }
        }

        if( (low >= 0) && (r[low].getArtist().compareTo(toFind) == 0 ))
        {
            linearPrintArtist(r, low, toFind);
        }
        else
            System.out.println("NOT found: " + toFind);
    }

    public static void linearPrintTitle(Music[] r, int low, String toFind)
    {
        int i;
        int start = low;
        int end = low;

        // find starting point of matches
        i = low - 1;
        while((i >= 0) && (r[i].getTitle().compareTo(toFind) == 0))
        {
            start = i;
            i--;
        }
        // find ending point of matches
        i = low + 1;
        while((i < r.length) && (r[i].getTitle().compareTo(toFind) == 0))
        {
            end = i;
            i++;
        }
        // now print out the matches
        for(i = start; i <= end; i++)
            System.out.println(r[i]);
    }

    public static void linearPrintYear(Music[] r, int low, int toFind)
    {
        int i;
        int start = low;
        int end = low;

        // find starting point of matches
        i = low - 1;
        while((i >= 0) && (r[i].getYear() == toFind))
        {
            start = i;
            i--;
        }
        // find ending point of matches
        i = low + 1;
        while((i < r.length) && (r[i].getYear() == toFind))
        {
            end = i;
            i++;
        }
        // now print out the matches
        for(i = start; i <= end; i++)
            System.out.println(r[i]);
    }

    public static void linearPrintArtist(Music[] r, int low, String toFind)
    {
        int i;
        int start = low;
        int end = low;

        // find starting point of matches
        i = low - 1;
        while((i >= 0) && (r[i].getArtist().compareTo(toFind) == 0))
        {
            start = i;
            i--;
        }
        // find ending point of matches
        i = low + 1;
        while((i < r.length) && (r[i].getArtist().compareTo(toFind) == 0))
        {
            end = i;
            i++;
        }
        // now print out the matches
        for(i = start; i <= end; i++)
            System.out.println(r[i]);
    }

    public static void insertionTitle(Music[] source)
    {
        Music[] dest = new Music[ source.length ];

        for( int i = 0 ; i < source.length ; i++ )
        {
            Music next = source[ i ];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0 )
            {
                if( next.getTitle().compareTo(dest[k-1].getTitle()) > 0 )
                {
                    insertIndex = k;
                }
                else
                {
                    dest[ k ] = dest[ k - 1 ];
                }
                k--;
            }

            dest[ insertIndex ] = next;

//            Debugging Statements
//            uncomment to print the listings after each pass through the sort
//             System.out.println("\nPass # " + i);
//             for(Music a : dest)
//                if( a != null) System.out.printf("%-10s \n", a.getTitle() );
        }

        for(int i = 0; i < dest.length; i++)
            source[i] = dest[i];
    }

    public static void insertionYear(Music[] source)
    {
        Music[] dest = new Music[ source.length ];

        for( int i = 0 ; i < source.length ; i++ )
        {
            Music next = source[ i ];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0 )
            {
                if(next.getYear() > (dest[k-1].getYear()))
                {
                    insertIndex = k;
                }
                else
                {
                    dest[ k ] = dest[ k - 1 ];
                }
                k--;
            }

            dest[ insertIndex ] = next;

//            Debugging Statements
//            uncomment to print the listings after each pass through the sort
//             System.out.println("\nPass # " + i);
//             for(Music a : dest)
//                if( a != null) System.out.printf("%-10s \n", a.getYear() );
        }

        for(int i = 0; i < dest.length; i++)
            source[i] = dest[i];
    }

    public static void insertionArtist(Music[] source)
    {
        Music[] dest = new Music[ source.length ];

        for( int i = 0 ; i < source.length ; i++ )
        {
            Music next = source[ i ];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0 )
            {
                if( next.getArtist().compareTo(dest[k-1].getArtist()) > 0 )
                {
                    insertIndex = k;
                }
                else
                {
                    dest[ k ] = dest[ k - 1 ];
                }
                k--;
            }

            dest[ insertIndex ] = next;

//            Debugging Statements
//            uncomment to print the listings after each pass through the sort
//             System.out.println("\nPass # " + i);
//             for(Music a : dest)
//                if( a != null) System.out.printf("%-10s \n", a.getArtist() );
        }

        for(int i = 0; i < dest.length; i++)
            source[i] = dest[i];
    }
}