/**
 * This is a class that tests the Card class.
 *
 *  Maya Abraham
 *  4/20/22
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
      Card aceHearts2 = new Card("ace", "hearts", 1);
      Card queenDiamonds = new Card("queen", "diamonds", 12);
      Card threeSpades = new Card("three", "spades", 3);
		
      
      // Test card 1 and methods
      System.out.println("**** Tests Card 1: ace of hearts ****");
      System.out.println("  rank: " + aceHearts.rank());
      System.out.println("  suit: " + aceHearts.suit());
      System.out.println("  pointValue: " + aceHearts.pointValue());
      System.out.println("  toString: " + aceHearts.toString());
      System.out.println();

      // Test card 2
      System.out.println("**** Tests Card 2: queen of diamonds ****");
      System.out.println("  rank: " + queenDiamonds.rank());
      System.out.println("  suit: " + queenDiamonds.suit());
      System.out.println("  pointValue: " + queenDiamonds.pointValue());
      System.out.println("  toString: " + queenDiamonds.toString());
      System.out.println();

      // Test card 3
      System.out.println("**** Tests Card 3: three of spades ****");
      System.out.println("  rank: " + threeSpades.rank());
      System.out.println("  suit: " + threeSpades.suit());
      System.out.println("  pointValue: " + threeSpades.pointValue());
      System.out.println("  toString: " + threeSpades.toString());
      System.out.println();

      // Test matches() method
      System.out.println("**** matches Test ****");
      System.out.println(" ace of hearts and ace of hearts: " + aceHearts.matches(aceHearts2));
      System.out.println(" ace of hearts and queen of diamonds: " + aceHearts.matches(queenDiamonds));
      

   }
}
