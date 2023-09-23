import java.util.LinkedList;
import java.util.Random;
public class Deck{

  private LinkedList<Card> m_deck = new LinkedList<Card>();

  /**
  A default @Deck constructor that initializes a fresh deck of 52 cards in the linked list
  */
  
  public Deck(){
    for(int i=0;i<4;++i){
      for(int j = 2; j<15; ++j){
        Card card = new Card(j,i);
        m_deck.add(card);
      }
    }
  }

  /**
  A copy @Deck constructor that creates a deck from another deck, making sure to make a deep copy of each card
  */

  public void Deck(Deck deck){
    for(int l=0; l<deck.numCards(); ++l){
      this.m_deck.add(deck.getCard(l));
    }
  }

  /**
  A @toString method that displays each card currently in the deck
  */

  public String toString(){
    String str = "";
    for (int k=0; k<m_deck.size(); ++k){
      str += m_deck.get(k) + "\n";
    }
    return str;
  }

  /**
  A size @numCards method that returns the number of cards in the underlying LinkedList<Card> as an integer
  */

  public int numCards(){
    return this.m_deck.size();
  }


  /**
  a method, @deal, that removes a random card from the list and returns that card.  (This can be achieved by
  generating a random number between 0 (inclusive) and the length of the list (exclusive) and removing/returning the card at
  that list position.
  */

  public Card deal(){
    Random rand = new Random();
    int int_rand = rand.nextInt(this.m_deck.size()-1);
    Card rand_card = m_deck.get(int_rand);
    m_deck.remove(int_rand);
    return rand_card;
  }

  /**
  @getCard constructor to help with gettings cards for copy constructor (for some reason it didn't work unless I made this method)
  */

  public Card getCard(int n){
    return this.m_deck.get(n);
  }

}
