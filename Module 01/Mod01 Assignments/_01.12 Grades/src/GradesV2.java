/**
 * GradesV2 calculates the total points and average grade each time a new score
 * is added to the total.
 *
 * @ Cristopher Encarnacion
 * @ September 16, 2023
 */
public class GradesV2
{
    public static void main(String[] args)
    {
        //local variables
        int numTests = 0;      //counts number of tests
        int testGrade = 0;     //individual test grade
        int totalPoints = 0;   //total points for all tests
        double average = 0.0;  //average grade

        //calculate total points and average score
        numTests++;
        testGrade = 95;
        totalPoints += testGrade;
        average = (double)totalPoints / numTests;
        System.out.print("Test # " + numTests);
        System.out.print("\tTest Grade: " + testGrade);
        System.out.print("\tTotal Points: " + totalPoints);
        System.out.println("\tAverage Score: " + average);

        //calculate total points and average score
        numTests++;
        testGrade = 73;
        totalPoints += testGrade;
        average = (double)totalPoints / numTests;
        System.out.print("Test # " + numTests);
        System.out.print("\tTest Grade: " + testGrade);
        System.out.print("\tTotal Points: " + totalPoints);
        System.out.println("\tAverage Score: " + average);

        //calculate total points and average score
        numTests++;
        testGrade = 91;
        totalPoints += testGrade;
        average = (double)totalPoints / numTests;
        System.out.print("Test # " + numTests);
        System.out.print("\tTest Grade: " + testGrade);
        System.out.print("\tTotal Points: " + totalPoints);
        System.out.println("\tAverage Score: " + average);

        //calculate total points and average score
        numTests++;
        testGrade = 82;
        totalPoints += testGrade;
        average = (double)totalPoints / numTests;
        System.out.print("Test # " + numTests);
        System.out.print("\tTest Grade: " + testGrade);
        System.out.print("\tTotal Points: " + totalPoints);
        System.out.println("\tAverage Score: " + average);

        //calculate total points and average score
        numTests++;
        testGrade = 91;
        totalPoints += testGrade;
        average = (double)totalPoints / numTests;
        System.out.print("Test # " + numTests);
        System.out.print("\tTest Grade: " + testGrade);
        System.out.print("\tTotal Points: " + totalPoints);
        System.out.println("\tAverage Score: " + average);

        //calculate total points and average score
        numTests++;
        testGrade = 81;
        totalPoints += testGrade;
        average = (double)totalPoints / numTests;
        System.out.print("Test # " + numTests);
        System.out.print("\tTest Grade: " + testGrade);
        System.out.print("\tTotal Points: " + totalPoints);
        System.out.println("\tAverage Score: " + average);

        //calculate total points and average score
        numTests++;
        testGrade = 76;
        totalPoints += testGrade;
        average = (double)totalPoints / numTests;
        System.out.print("Test # " + numTests);
        System.out.print("\tTest Grade: " + testGrade);
        System.out.print("\tTotal Points: " + totalPoints);
        System.out.println("\tAverage Score: " + average);

        //calculate total points and average score
        numTests++;
        testGrade = 97;
        totalPoints += testGrade;
        average = (double)totalPoints / numTests;
        System.out.print("Test # " + numTests);
        System.out.print("\tTest Grade: " + testGrade);
        System.out.print("\tTotal Points: " + totalPoints);
        System.out.println("\tAverage Score: " + average);

        //calculate total points and average score
        numTests++;
        testGrade = 82;
        totalPoints += testGrade;
        average = (double)totalPoints / numTests;
        System.out.print("Test # " + numTests);
        System.out.print("\tTest Grade: " + testGrade);
        System.out.print("\tTotal Points: " + totalPoints);
        System.out.print("\tAverage Score: " + average);
    }
}