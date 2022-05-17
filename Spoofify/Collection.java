import java.util.ArrayList;
import java.util.Random;
public abstract class Collection implements Comparable<Collection>{
  /**
  Member Variables
  */
  private String m_title;
  private ArrayList<Content> m_list;
  /**
  @Collection() Default Constructor
  */
  public Collection(){
    m_title = "";
    m_list = new ArrayList<Content>();
  }
  /**
  @Collection Overloaded Constructor
  */
  public Collection(String title, ArrayList<Content> list){
    m_title = title;
    m_list = list;
  }
  /**
  @Collection Copy Constructor
  */
  public Collection(Collection col){
    this.m_title = col.getTitleCol();
    this.m_list = col.getListCol();
  }
  /**
  @Collection Mutators
  */
  public String getTitleCol(){
    return this.m_title;
  }

  public void setTitleCol(String title){
    this.m_title = title;
  }

  public ArrayList<Content> getListCol(){
    return this.m_list;
  }

  public void setListCol(ArrayList<Content> list){
    this.m_list = list;
  }
  /**
  @toString Prints out Collection
  */
  public String toString(){
    return "\n\n" + "Collection Title: " + m_title + "\n"
    + "List of Content: " + m_list + "\n";
  }

  public int compareTo(Collection collection){
    //number of content in m_list are equal and return 0
    if(this.m_list.size()==collection.m_list.size()){
      return 0;
    }
    //number of content in m_list is less than m_list and return -1
    else if(this.m_list.size()<collection.m_list.size()){
      return -1;
    }
    //number of content in m_list is greater than m_list and return -1
    else {
      return 1;
    }

  }
  /**
  @shuffle is a method that plays a random song and returns said song
  */
  public Content shuffle(){
    Random rand = new Random();
    int num = rand.nextInt(this.m_list.size());
    Content song = this.m_list.get(num);
    song.play();
    return song;
  }
}
