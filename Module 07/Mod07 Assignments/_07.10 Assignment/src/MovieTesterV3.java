/**
 * Purpose: Print and movie data
 *
 * @author Cristopher Encarnacion
 * @version 03/08/24
 */

public class MovieTesterV3 {
    public static void main(String[] args) {
        Movie[] movies = new Movie[10];

        movies[0] = new Movie("Wall-E", 2008, "Pixar");
        movies[1] = new Movie("Encanto", 2021, "Disney");
        movies[2] = new Movie("Toy Story", 1995, "Pixar");
        movies[3] = new Movie("Frozen 2", 2019, "Disney");
        movies[4] = new Movie("Despicable Me", 2010, "Illumination");
        movies[5] = new Movie("The Lego Movie", 2014, "Warner");
        movies[6] = new Movie("Monsters, Inc.", 2001, "Pixar");
        movies[7] = new Movie("Wreck-It Ralph", 2012, "Disney");
        movies[8] = new Movie("Sing 2", 2021, "Illumination");
        movies[9] = new Movie("TENET", 2020, "Warner");

        System.out.println("Starting data:\n");
        printTable(movies);

        System.out.println("\nSorting movies by title (ascending):\n");
        printTable(selectionTitle(movies, 1)); // 1 = ascending; 2 = descending

        System.out.println("\nSorting movies by title (descending):\n");
        printTable(selectionTitle(movies, 2));

        System.out.println("\nSorting movies by year released (ascending):\n");
        printTable(selectionYear(movies, 1));

        System.out.println("\nSorting movies by year released (descending):\n");
        printTable(selectionYear(movies, 2));

        System.out.println("\nSorting movies by studio (ascending):\n");
        printTable(selectionStudio(movies, 1));

        System.out.println("\nSorting movies by studio (descending):\n");
        printTable(selectionStudio(movies, 2));
    }

    public static void printTable(Movie[] movies)
    {
        System.out.println("Title\t\t\t  Year\t Studio");
        System.out.println("----------------------------------------------------");
        for(Movie movie : movies) {
            System.out.printf("%-17s %-6d %-7s\n", movie.getTitle(), movie.getYear(),
                    movie.getStudio());
        }
    }

    public static Movie[] selectionTitle(Movie[] source, int order)
    {
        int i;
        int k;
        int posMax;
        Movie temp;
        boolean comparison;

        for ( i = source.length - 1 ; i >= 0 ; i-- )
        {
            posMax = 0;
            for ( k = 0 ; k <= i ; k++ )
            {
                // check if ascending or descending
                if(order == 2) {
                    comparison = (source[ k ].getTitle().compareTo(source[ posMax ].getTitle()) < 0);
                }
                else {
                    comparison = (source[ k ].getTitle().compareTo(source[ posMax ].getTitle()) > 0);
                }

                if (comparison)
                    posMax = k;
            }

            temp = source[ i ];
            source[ i ] = source[posMax ];
            source[ posMax ] = temp;
        }
        return source;
    }

    public static Movie[] selectionYear(Movie[] source, int order)
    {
        int i;
        int k;
        int posMax;
        Movie temp;
        boolean comparison;

        for ( i = source.length - 1 ; i >= 0 ; i-- )
        {
            posMax = 0;
            for ( k = 0 ; k <= i ; k++ )
            {
                // check if ascending or descending
                if(order == 2) {
                    comparison = (source[ k ].getYear() < source[ posMax ].getYear());
                }
                else {
                    comparison = (source[ k ].getYear() > source[ posMax ].getYear());
                }

                if (comparison)
                    posMax = k;
            }

            temp = source[ i ];
            source[ i ] = source[posMax ];
            source[ posMax ] = temp;
        }
        return source;
    }

    public static Movie[] selectionStudio(Movie[] source, int order)
    {
        int i;
        int k;
        int posMax;
        Movie temp;
        boolean comparison;

        for ( i = source.length - 1 ; i >= 0 ; i-- )
        {
            posMax = 0;
            for ( k = 0 ; k <= i ; k++ )
            {
                // check if ascending or descending
                if(order == 2) {
                    comparison = (source[ k ].getStudio().compareTo(source[ posMax ].getStudio()) < 0);
                }
                else {
                    comparison = (source[ k ].getStudio().compareTo(source[ posMax ].getStudio()) > 0);
                }

                if (comparison)
                    posMax = k;
            }

            temp = source[ i ];
            source[ i ] = source[posMax ];
            source[ posMax ] = temp;
        }
        return source;
    }
}