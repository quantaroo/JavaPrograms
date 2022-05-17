import java.util.ArrayList;
import java.util.Scanner;
public class Content implements Comparable<Content>{
  /**
  Member Variables
  */
  private String m_title;
  private ArrayList<String> m_genre;
  private Artist m_artist;
  private int m_played;
  /**
  @Content() Default Constructor
  */
  public Content(){
    m_title = "";
    m_genre = new ArrayList<String>();
    m_artist = new Artist();
    m_played = 0;
  }
  /**
  @Content Overloaded Constructor
  */
  public Content(String title, ArrayList<String> genre, Artist artist, int count){
    m_title = title;
    m_genre = genre;
    m_artist = artist;
    m_played = count;
  }
  /**
  @Content Copy Constructor
  */
  public Content(Content cont){
    m_title = cont.getTitle();
    m_genre = new ArrayList<String>(cont.getGenre());
    m_artist = cont.getArtist();
    m_played = cont.getCount();
  }
  /**
  @Content Mutators
  */
  public String getTitle(){
    return this.m_title;
  }

  public void setTitle(String title){
    this.m_title = title;
  }

  public ArrayList<String> getGenre(){
    return this.m_genre;
  }

  public void setGenre(int num){
    if(num < 4){
      for(int i=0; i<num; ++i){
        System.out.println("What genre is this content? :");
        Scanner input = new Scanner(System.in);
        String genre = input.nextLine();
        this.m_genre.add(genre);
      }
    }
  }

  public Artist getArtist(){
    return this.m_artist;
  }

  public void setArtist(Artist artist){

    this.m_artist = artist;
  }

  public int getCount(){
    return this.m_played;
  }

  public void setCount(int num){
    m_played = num;
  }
  /**
  @toString Prints out Content
  */
  public String toString(){
    return "\n---------------------------\n"
    + "Content title: " + m_title + "\n"
    + "Genre types: " + m_genre + "\n"
    + "Artist: " + "\n"
    + m_artist.toString() + "\n"
    + "Amount Played: " + m_played
    +"\n---------------------------\n";
  }
  /**
  @compareTo is a method we use to sort.
  */
  public int compareTo(Content content){
    //number of m_played are equal and return 0
    if(this.m_played==content.getCount()){
      return 0;
    }

    //number of this.m_played is less than m_played and return -1

    else if(this.m_played<content.getCount()){
      return -1;
    }

    //number of this.m_played is greater thant m_played and return 1
    else {
      return 1;
    }

  }
  /**
  @play is a method we use to add to the m_played counter
  */
  public void play(){
    m_played += 1;
  }

}
