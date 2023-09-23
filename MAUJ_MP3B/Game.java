import java.util.LinkedList;
public class Game extends Player{
  public int m_suitePile;
  private Dealer m_dealer;
  private LinkedList<Card> pile;

  /**
  play - carries out the rules of the game until one of the players has won.
  */

  public play(){
    Player player1 = new Player(1,this.m_dealer,this.m_pile);
    Player player2 = new Player(2,this.m_dealer,this.m_pile);
    while(!(this.m_pile.length() == 0)){
      player1.takeTurn();
      player2.takeTurn();
      

    }
  }


  /**
  This class should have a default constructor, which initializes the dealer and the starter pile.
  It should then add 1 card to the starter pile. It then initializes both players, passing the dealer and the starter pile to each.
  */
  public Game(){
    LinkedList<Card> pile = new LinkedList<Card>();
    Dealer m_dealer = new Dealer();
    m_pile = m_dealer.deals(1 , pile);
    m_suitePile = (m_pile.getCard()).getSuite();
  }

  /**
  This class should also accessor methods, as well as any other methods you feel are appropriate.
  */
}
