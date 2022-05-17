import java.util.ArrayList;
public class Listener extends Account{
  /**
  Member Variables
  */
  private final boolean m_creator = false;
  private ArrayList<Content> m_favorites;
  /**
  @Listener Copy Constructor
  */
  public Listener(Listener ob, ArrayList<Content> favorites){
    super(ob);
    m_favorites = favorites;
  }
  /**
  @Listener() Default Constructor
  */
  public Listener(){
    super();
    m_favorites = new ArrayList<Content>();
  }
  /**
  @Listener Overloaded Constructors
  */
  public Listener(String name,ArrayList<Content> favorites){
    super(name);
    m_favorites = favorites;
  }

  public Listener(String name){
    super(name);
  }
  /**
  @Listener Mutators
  */
  public boolean getCreator(){
    return this.m_creator;
  }
  /**
  @favorite is a method that adds a content to a favorite ArrayList for the Listener
  */
  public void favorite(Content content){
    m_favorites.add(content);
  }
  /**
  @toString Prints out Listener
  */
  public String toString(){
    return super.toString() + "\n"
    + "Creator: " + m_creator + "\n"
    + "Favorites: " + m_favorites + "\n";

  }
}
