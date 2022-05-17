import java.util.ArrayList;
public class Song extends Content{
  /**
  @Song Copy Constructor
  */
  public Song(Song ob){
    super(ob);
  }
  /**
  @Song() Default Constructor
  */
  public Song(){
    super();
  }
  /**
  @Song Overloaded Constructor
  */
  public Song(String title, ArrayList<String> genre, Artist artist, int count){
    super(title,genre,artist,count);
  }
  /**
  @toString Prints out Song 
  */
  public String toString(){
    return super.toString();
  }

}
