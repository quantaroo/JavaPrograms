import java.util.ArrayList;
public class Album extends Collection{
  /**
  @Album Copy Constructor
  */
  public Album(Album ob){
    super(ob);
  }
  /**
  @Album() Default Constructor
  */
  public Album(){
    super();
  }
  /**
  @Album Overloaded Constructor
  */
  public Album(String title, ArrayList<Content> list){
    super(title,list);
  }
  /**
  @toString Prints out Album 
  */
  public String toString(){
    return super.toString();
  }
}
