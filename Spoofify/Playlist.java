import java.util.ArrayList;
public class Playlist extends Collection{
  /**
  @Playlist Copy Constructor
  */
  public Playlist(Playlist ob){
    super(ob);
  }
  /**
  @Playlist Default Constructor
  */
  public Playlist(){
    super();
  }
  /**
  @Playlist Overloaded Constructor
  */
  public Playlist(String title, ArrayList<Content> list){
    super(title,list);
  }
  /**
  @toString Prints out Playlist 
  */
  public String toString(){
    return super.toString();
  }

}
