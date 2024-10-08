
/**
 * The purpose of this program is to 
 * calculate the average of four grades
 * 
 * @author Meg Abyte 
 * @version 06/11/17
 */
public class GradesV1
{
    public static void main(String[ ] args)
    {
        int test1 = 96;         //test score 1
        int test2 = 78;         //test score 2
        int test3 = 85;         //test score 3
        int test4 = 87;         //test score 4
        double average;         //average of four test scores
        
        //calculate the average grade and print the results
        average = (test1 + test2 + test3 + test4) / 4.0;
        System.out.println("Average Score: " + average);
        int d = 11 - 17 / 5 % 4 + 2;
        System.out.print(d);
    }//end of main method
}//end of class
