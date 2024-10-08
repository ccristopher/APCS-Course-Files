/**
 * Purpose: Represents a student with their name and quiz scores
 *
 * @author Cristopher Encarnacion
 * @version 03/01/24
 */

public class Student
{
    // Instance variables
    private String name;
    private int[] qScores;

    // Constructor
    public Student(String name, int q1, int q2, int q3, int q4, int q5)
    {
        this.name = name;
        this.qScores = new int[]{q1, q2, q3, q4, q5};
    }

    // Getters & Setters
    public int getQuiz(int q)
    {
        return qScores[q - 1];
    }

    public void setQuiz(int q, int qScore)
    {
        qScores[q - 1] = qScore;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String n)
    {
        name = n;
    }

    // To string
    public String toString()
    {
        return name + " received a " + qScores[0] + " in Q1, a " + qScores[1] + " in Q2, a " + qScores[2] +
                " in Q3, a " + qScores[3] + " in Q5, and a " + qScores[4] + " in Q5.\n";
    }
}