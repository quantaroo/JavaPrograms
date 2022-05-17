public abstract class Account{
  /**
  Member Variables
  */
  private String m_name;
  /**
  @Account Default Constructor
  */
  public Account(){
    m_name = "";
  }
  /**
  @Account Overloaded Constructor
  */
  public Account(String name){
    m_name = name;
  }
  /**
  @Account Copy Constructor
  */
  public Account(Account acc){
    this.m_name = acc.m_name;
  }
  /**
  @Account Mutators
  */
  public String getName(){
    return this.m_name;
  }

  public void setName(String name){
    this.m_name = name;
  }
  /**
  @toString Prints out Account
  */
  public String toString(){
    return "Account name: " + this.m_name;
  }

}
