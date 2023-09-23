import java.util.LinkedList;
public class Card{
  private int m_num;
  private int m_suite;

  /**
  A default constructor
  @Card() is the default constructor 
  */

  public Card(){
    m_num = -1;
    m_suite = -1;
  }

  /**
  An overloaded constructor
  @Card overload constructor
  */

  public Card(int number, int suite){
    m_num = number;
    m_suite = suite;
  }

  /**
  A copy constructor
  @Card copies the card in the ()
  */

  public Card(Card original){
    this.m_num = original.getNum();
    this.m_suite = original.getSuite();
  }

  /**
  toString method that nicely displays the suit and rank of the card. In particular, suits should be represented textually
  (not by their integer values), as should all face cards and aces. Eg. “Queen of Hearts”, “3 of Diamonds”, “Ace of Spades”
  @toString
  */

  public String toString(){
    return this.getStrNum() + " of " + this.getStrSuite();
  }


  /**
  equals method - assume 2 cards are equal if their values are equal
  @equals returns a boolean of true or false if the cards are equal
  */

  public boolean equals(Card otherCard) {
      if (!(otherCard instanceof Card)) {
          return false;
      }
      else{
        return (this.equals(otherCard.m_num));
      }
    }

  /**
  Mutators and accessors for value and suit
  @getStrNum gets the card number string
  @getStrSuite get the card suite string
  @getNum gets the card
  @getSuite gets the suite
  @setNum sets the number
  @setSuite sets the suite
  */

  public String getStrNum(){
    if(m_num < 11){
      String s_num = String.valueOf(m_num);
      return s_num;
    }
    else if(m_num == 11){
      return "Jack";
    }
    else if(m_num == 12){
      return "Queen";
    }
    else if(m_num == 13){
      return "King";
    }
    else if(m_num == 14){
      return "Ace";
    }
    else{
      return "";
    }
  }

  public String getStrSuite(){
    if(m_suite == 0){
      return "Heart";
    }
    else if(m_suite == 1){
      return "Spades";
    }
    else if(m_suite == 2){
      return "Clubs";
    }
    else if(m_suite == 3){
      return "Diamonds";
    }
    else{
      return "";
    }
  }

  public int getNum(){
    return m_num;
  }
  public void setNum(int s){
    m_num = s;
  }
  public int getSuite(){
    return m_suite;
  }
  public void setSuite(int t){
    m_suite = t;
  }
}
