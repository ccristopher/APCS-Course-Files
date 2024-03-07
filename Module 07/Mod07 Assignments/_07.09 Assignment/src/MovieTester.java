/**
 * Purpose: Print and modify student grade data
 *
 * @author Cristopher Encarnacion
 * @version 03/01/24
 */

import java.util.ArrayList;
import java.util.List;

public class MovieTester {
    public static void main(String[] args) {
        // Create array of students
        List<Movie> movies = new ArrayList<Movie>();

        // Initialize students
        movies.add(new Movie("Wall-E", 2008, "Pixar"));
        movies.add(new Movie("Coco", 2017, "Pixar"));
        movies.add(new Movie("Toy Story", 1995, "Pixar"));
        movies.add(new Movie("Up", 2009, "Pixar"));
        movies.add(new Movie("Finding Nemo", 2003, "Pixar"));
        movies.add(new Movie("Ratatouille", 2007, "Pixar"));
        movies.add(new Movie("Monsters, Inc.", 2001, "Pixar"));
        movies.add(new Movie("Inside Out", 2015, "Pixar"));
        movies.add(new Movie("The Incredibles", 2004, "Pixar"));
        movies.add(new Movie("Soul", 2020, "Pixar"));

        System.out.println("Starting Gradebook:\n");
        printTable(movies);
    }

    // Prints the gradebook table
    public static void printTable(List<Movie> movies)
    {
        System.out.println("Title\t\t\t  Year\t Studio");
        System.out.println("----------------------------------------------------");
        for(Movie movie : movies) {
            System.out.printf("%-15s %6d %7s\n", movie.getTitle(), movie.getYear(),
                    movie.getStudio());
        }
    }
}