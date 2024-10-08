/**
 * @purpose: PlanetV10 Object Class
 *
 * @author Cristopher Encarnacion
 * @version 2/4/2024
 */

public class QuizResults {
    // private instant variables for name, first quiz score, and second quiz score
    private String n;
    private int quiz1;
    private int quiz2;

    // constructor
    public QuizResults(String name, int firstQuiz, int secondQuiz) {
        n = name;
        quiz1 = firstQuiz;
        quiz2 = secondQuiz;
    }

    // getters
    public String getName() {
        return n;
    }

    public int getFirstQuiz() {
        return quiz1;
    }

    public int getSecondQuiz() {
        return quiz2;
    }

    // setters
    public void setName(String name) {
        n = name;
    }

    public void setFirstQuiz(int firstQuiz) {
        quiz1 = firstQuiz;
    }

    public void setSecondQuiz(int secondQuiz) {
        quiz2 = secondQuiz;
    }

    // calculate and return difference between scores
    public double calcDifference() {
        double difference;
        difference = quiz2 - quiz1;
        return difference;
    }

    // calculate and return average of scores
    public double calcAverage() {
        int average;
        average = (quiz1 + quiz2) / 2;
        return average;
    }

    // represent object as string
    public String toString() {
        return String.format("%-14s %3s %14s", getName(), getFirstQuiz(), getSecondQuiz());
    }
}