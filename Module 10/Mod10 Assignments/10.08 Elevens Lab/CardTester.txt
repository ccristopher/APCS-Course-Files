/**
 * This is a class that tests the Card class.
 *
 *  Cristopher Encarnacion
 *  4/27/2024
 */

public class CardTester
{
   /**
    * The main method in this class checks the Card operations for consistency.
    * @param args is not used.
    */
   public static void main(String[] args) {

      /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */

      // Establish new cards
      Card aceHearts = new Card("ace", "hearts", 1);
      Card queenSpades = new Card("queen", "spades", 3);
      Card aceClubs = new Card("ace", "clubs", 10);

      // Test card 1 and methods
      System.out.println("**** Tests Card 1: ace of hearts ****");
      System.out.println("  rank: " + aceHearts.rank());
      System.out.println("  suit: " + aceHearts.suit());
      System.out.println("  pointValue: " + aceHearts.pointValue());
      System.out.println("  toString: " + aceHearts.toString());
      System.out.println();
      System.out.println("**** matches Card 1 ****");
      System.out.println("  matching: " + aceHearts.matches(aceHearts));
      System.out.println();

      // Test card 2
      System.out.println("**** Tests Card 2: queen of spades ****");
      System.out.println("  rank: " + queenSpades.rank());
      System.out.println("  suit: " + queenSpades.suit());
      System.out.println("  pointValue: " + queenSpades.pointValue());
      System.out.println("  toString: " + queenSpades.toString());
      System.out.println();
      System.out.println("**** matches Card 1 ****");
      System.out.println("  matching: " + queenSpades.matches(aceHearts));
      System.out.println();

      // Test card 3
      System.out.println("**** Tests Card 3: ace of clubs ****");
      System.out.println("  rank: " + aceClubs.rank());
      System.out.println("  suit: " + aceClubs.suit());
      System.out.println("  pointValue: " + aceClubs.pointValue());
      System.out.println("  toString: " + aceClubs.toString());
      System.out.println();
      System.out.println("**** matches Card 2 ****");
      System.out.println("  matching: " + aceClubs.matches(queenSpades));
      System.out.println();

      // Test matches() method

   }
}
