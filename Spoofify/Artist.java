public class Artist extends Account{
  /**
  Member Variables
  */
  private final boolean m_creator = true;
  /**
  @Artist Copy Constructor
  */
  public Artist(Artist ob){
    super(ob);
  }
  /**
  @Artist() Default Constructor
  */
  public Artist(){
    super();
  }
  /**
  @Artist Overloaded Constructor
  */
  public Artist(String name){
    super(name);
  }
  /**
  @Artist Mutators
  */
  public boolean getCreator(){
    return this.m_creator;
  }
  /**
  @toString Prints out Artist 
  */
  public String toString(){
    return super.toString() + "\n"
    + "Creator: " + m_creator;
  }

}
