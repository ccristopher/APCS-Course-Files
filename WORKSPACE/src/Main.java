public class Main {
    public static void main(String[] args) {
        System.out.println("Samira".equals("Sami"));
        System.out.println("SAMI".compareTo("Samira") < 0);
        System.out.println("Sami".compareTo("SAMI") < 0);

        String word = "moonlight";
        String x = word.substring(4);
        String y = word.substring(4, 8);
        if( x == y)
            System.out.print(1);
        else if( x.equals(y))
            System.out.print(2);
        else
            System.out.println(3);

        String word1 = "stay";
        String word2 = "strong";
        System.out.println(word1.compareTo(word2));

        System.out.println("Joseph".equals("JOSEPH"));
        System.out.println("Joseph".compareTo("JOSEPH") == 0);
        System.out.println("Jose".compareTo("Joseph") < 0);

        System.out.println((int)5.2 != (double)5);
    }
}