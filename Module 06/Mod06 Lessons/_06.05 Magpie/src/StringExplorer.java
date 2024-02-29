/**
 * A program to allow students to try out different
 * String methods.
 *
 * Code adapted from work by Laurie White for the College Board.
 *
 * @author Cristopher Encarnacion
 * @version 2/5/2024
 */
public class StringExplorer
{

    public static void main(String[] args)
    {
        String sample = "The quick brown fox jumped over the lazy dog.";
        System.out.println("sample = " + sample);
        System.out.println();

        //  Demonstrate the indexOf method.
        int position = sample.indexOf("quick");
        System.out.println("sample.indexOf(\"quick\") = " + position);

        int notFoundPos  = sample.indexOf("slow");
        System.out.println("sample.indexOf(\"slow\") = " + notFoundPos);

        position = sample.indexOf("o");
        System.out.println("sample.indexOf(\"o\") = "+ position);
        position = sample.indexOf("o", position + 1);
        System.out.println("sample.indexOf(\"o\", position + 1) = " + position);

        System.out.println();

        //  Demonstrate the toLowerCase method.
        String lowerCase = sample.toLowerCase();
        System.out.println("sample.toLowerCase() = " + lowerCase);
        System.out.println("After toLowerCase(), sample = " + sample);
        System.out.println();

        boolean isEqual = sample.equals(sample.toLowerCase());
        System.out.println("sample.equals(sample.toLowerCase()) = "+ isEqual);

        // Assign a new value to sample. Use a phrase of your choosing.
        // Pad the beginning and end of the string literal with spaces.
        System.out.println();
        String sample2 = " The five boxing wizards jump quickly ";
        System.out.println("sample2 = " + sample2);
        System.out.println();

        //  Add examples below for the following methods:
        //    trim()
        String trim = sample2.trim();
        System.out.println("sample2.trim() = " + trim);
        //    length()
        int length = sample2.length();
        System.out.println("sample2.length() = " + length);
        //    indexOf with one and two parameters
        position = sample2.indexOf("i");
        System.out.println("sample2.indexOf(\"i\") = "+ position);

        position = sample2.indexOf("i", position + 1);
        System.out.println("sample2.indexOf(\"i\", position + 1) = " + position);
        //    substring() with one and two parameters
        String substring = sample2.substring(5);
        System.out.println("sample2.substring(5) = " + substring);

        substring = sample2.substring(5, 16);
        System.out.println("sample2.substring(5, 16) = " + substring);
        //    compareTo()
        int compare = sample2.compareTo(sample);
        System.out.println("sample2.compareTo(sample) = " + compare);
    }

}
