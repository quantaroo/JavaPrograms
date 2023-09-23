import java.util.LinkedList;
import java.util.Random;
public class Dealer{

  private Deck m_deck;

  /**
  A default @Dealer constructor that initializes m_deck to a new Deck of 52 cards
  */

  public Dealer(){
      m_deck = new Deck();
  }

  /**
  A method, @deals, returns a new LinkedList that consists of n cards dealt randomly from the deck.
  If the deck is empty, it should return a LinkedList of length 0.
  */

  public LinkedList<Card> deals(int n, LinkedList<Card> hand){
    if(!(m_deck.numCards()==0)){
      for(int l=0;l<n;++l){
        hand.add(m_deck.deal());
      }
      return hand;
    }
    else{
      return hand;
    }
  }

  /**
  A size @numDealCards method that returns the number of cards in m_deck
  */

  public int numDealCards(){
    return m_deck.numCards();
  }

  /**
  A @toString method that just calls toString on m_deck and returns the result
  */

  public String toString(){
    return m_deck.toString();
  }
}
