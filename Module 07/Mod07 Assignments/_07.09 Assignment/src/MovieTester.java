/**
 * Purpose: Print and modify student grade data
 *
 * @author Cristopher Encarnacion
 * @version 03/01/24
 */

public class MovieTester {
    public static void main(String[] args) {
        // Create array of students
        Movie[] movies = new Movie[10];
        Movie[] sorted = new Movie[10];

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

        System.out.println("Starting Gradebook:\n");
        printTable(movies);

        printTable(insertionMovie(movies));
    }

    // Prints the gradebook table
    public static void printTable(Movie[] movies)
    {
        System.out.println("Title\t\t\t  Year\t Studio");
        System.out.println("----------------------------------------------------");
        for(Movie movie : movies) {
            System.out.printf("%-17s %-6d %-7s\n", movie.getTitle(), movie.getYear(),
                    movie.getStudio());
        }
    }
    public static Movie[] insertionMovie(Movie[] source)
    {
        Movie[] dest = new Movie[ source.length ];

        for( int i = 0 ; i < source.length ; i++ )
        {
            Movie next = source[ i ];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0 )
            {
                if( next.getTitle().compareTo( dest[k-1].getTitle() ) > 0 )
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
        }
        return dest;
    }
}