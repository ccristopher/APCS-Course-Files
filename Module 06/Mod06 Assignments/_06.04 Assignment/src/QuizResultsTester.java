/**
 * @purpose: Tester to create an array of QuizResults objects
 *
 * @author Cristopher Encarnacion
 * @version 2/4/2024
 */

public class QuizResultsTester {
    public static void main(String[] args) {

        // Create an array of students and their quiz scores
        QuizResults[] students =
                {
                        new QuizResults("Cristopher", 84, 92),
                        new QuizResults("Kelvin", 74, 93),
                        new QuizResults("Jian", 85, 99),
                        new QuizResults("Sanchez", 94, 82),
                        new QuizResults("Jackie", 67, 62)
                };

        // initialize variables
        double difference = 0;
        double average = 0;

        // Print header for quiz results table
        System.out.printf("%26s %n", "Quiz Results");
        System.out.printf("%s %14s %14s %14s %14s %n",
                "Student Name", "Quiz1 Grade", "Quiz2 Grade", "Difference", "Average");
        System.out.print("=========================================================================");

        // iterate through student array and print scores, differences, and averages
        for (QuizResults results: students) {
            difference = results.calcDifference();
            average = results.calcAverage();
            System.out.println();
            System.out.printf("%s %18.2f %17.2f", results, difference, average);
        }
    }
}