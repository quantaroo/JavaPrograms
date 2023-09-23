import java.util.LinkedList;

public class Player{

  private int = m_number;
  private LinkedList<Card> m_hand = new LinkedList<Card>();


  /**
  takeTurn() - removes and returns a playable card from the list of owned cards, adding to the hand from the dealer stock as needed.
  If the player must pass the turn, this method should return null.
  */

  public int takeTurn(){
    int pileLength = m_pile.length();
    for(int i=0;i<m_hand.length(); ++i){
      if((m_hand.get(i)).getSuite()==m_suitePile){
        int num = (m_hand.get(i)).getNum();
        m_pile.add(m_hand.get(i));
        m_hand.remove(i);
        return num;
        break;
      }
    }

    if(m_pile.length() == pileLength){
      while(m_pile.length == pileLength){
        m_dealer.deals(1 , m_hand);
        for(int i=0;i<m_hand.length(); ++i){
          if((m_hand.get(i)).getSuite()==m_suitePile){
            int num = (m_hand.get(i)).getNum();
            m_pile.add(m_hand.get(i));
            m_hand.remove(i);
            return num;
            break;
          }
        }
      }
    }
  }

  /**
  newSuit() - returns the new suit to start using. It will be called by the Game class if the takeTurn() method returns an 8.
  */
  public int newSuite(){
    int hearts = 0;
    int spades = 0;
    int clubes = 0;
    int diamonds = 0;
    for(int j=0; j<m_hand.length(); ++j){
      if((m_hand.get(j)).getSuite()==0){
        hearts += 1;
      }
      else if((m_hand.get(j)).getSuite()==1){
        spades += 1;
      }
      else if((m_hand.get(j)).getSuite()==2){
        clubes += 1;
      }
      else if((m_hand.get(j)).getSuite()==3){
        clubes += 1;
      }
    }
    if()
  }

  /**
  An overloaded constructor that takes a player number, Dealer, and a LinkedList<Card> representing the starter pile.
  This constructor should retrieve 5 cards from the Dealer and place them in the LinkedList representing the player’s hand.
  */

  public Player(int num,Dealer() deck,LinkedList<Card> pile){
    LinkedList<Card> hand = new LinkedList<Card>();
    hand = deck.deals(5);
    this.m_number = num;
    this.m_hand = hand;
  }

  /**
  Other private helper methods as required.
  */


}
