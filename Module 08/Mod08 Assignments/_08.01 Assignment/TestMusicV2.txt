/**
 * This class demonstrates the sequential search with an array of objects.
 *
 * @author Cristopher Encarnacion
 * @version 03/28/24
 */

public class TestMusicV2 {
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
        findTitle(album, "Runaway");

        System.out.println("\n\nSearching for Magnetic: ");
        findTitle(album, "Magnetic");

        System.out.println("\n\nSearching for 2010: ");
        findYear(album, 2010);

        System.out.println("\n\nSearching for 2024: ");
        findYear(album, 2024);

        System.out.println("\n\nSearching for Outkast: ");
        findArtist(album, "Outkast");

        System.out.println("\n\nSearching for Illit: ");
        findArtist(album, "Illit");
    }

    public static void printAlbum(Music[] a)
    {
        System.out.println("Title                     Year   Artist");
        System.out.println("-------------------------------------------------------");
        for(int i = 0; i < a.length; i++)
            System.out.println(a[i]);
    }

    public static void findTitle(Music[] a, String toFind)
    {
        int found = 0;

        System.out.println("Find results: ");
        for(int i = 0; i < a.length; i++)
        {
            if(a[i].getTitle().compareTo(toFind) == 0)
            {
                System.out.println(a[i]);
                found++;
            }
        }

        if(found == 0)
        {   // we have not found the location
            System.out.println(toFind + " is not in the allbum");
        }
    }

    public static void findYear(Music[] a, int toFind)
    {
        int found = 0;

        System.out.println("Find results: ");
        for(int i = 0; i < a.length; i++)
        {
            if(a[i].getYear() == toFind)
            {
                System.out.println(a[i]);
                found++;
            }
        }

        if(found == 0)
        {   // we have not found the location
            System.out.println(toFind + " is not in the album");
        }
    }

    public static void findArtist(Music[] a, String toFind)
    {
        int found = 0;

        System.out.println("Find results: ");
        for(int i = 0; i < a.length; i++)
        {
            if(a[i].getArtist().compareTo(toFind) == 0)
            {
                System.out.println(a[i]);
                found++;
            }
        }

        if(found == 0)
        {   // we have not found the location
            System.out.println(toFind + " is not in the album");
        }
    }
}