import java.util.Scanner;
public class test {
    public static String stringSearch (String phrase, String text) {
        int index = phrase.indexOf(text);


        if (index != -1) {


            return "The characters were found at " + index + " index.";


        }


        else


            return "Those characters could not be found.";
    }

    public static void main(String[] args) {
        System.out.println(stringSearch("Hello World", "world"));
    }
}