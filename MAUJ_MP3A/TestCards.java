import java.util.LinkedList;
public class TestCards{
  public static void main(String[] args){

    /**
    Test Deck Class and Card Class to see if card works and deck works
    */

    Deck deck1 = new Deck();
    System.out.println(deck1);
    System.out.println(deck1.numCards());
    System.out.println("");
    System.out.println("Here is the Card that I have taken out:");
    System.out.println(deck1.deal());
    System.out.println("");
    System.out.println(deck1);
    System.out.println(deck1.numCards());

    /**
    Test Deal Class and see if deal and deals works for the Deal class
    */

    Dealer deck2 = new Dealer();
    System.out.println(deck2);
    System.out.println(deck2.numDealCards());
    System.out.println("");
    System.out.println("Here is/are the Card(s) that I have taken out:");
    LinkedList<Card> hand = new LinkedList<Card>();
    System.out.println(hand.addAll(deck2.deals(5)));
    System.out.println(hand);
    System.out.println("");
    System.out.println(deck2);
    System.out.println(deck2.numDealCards());
    System.out.println("");



  }
}
