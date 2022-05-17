import java.util.ArrayList;
public class Podcast extends Content{
  /**
  Member Variables
  */
  private int m_episode;
  /**
  @Podcast Copy Constructor
  */
  public Podcast(Podcast ob){
    super(ob);
    m_episode = ob.m_episode;
  }
  /**
  @Podcast() Default Constructor
  */
  public Podcast(){
    super();
    m_episode = 0;
  }
  /**
  @Podcast Overloaded Constructor
  */
  public Podcast(String title, ArrayList<String> genre, Artist artist, int count, int episode){
    super(title,genre,artist,count);
    m_episode = episode;
  }
  /**
  @Podcast Mutators
  */
  public int getEpisode(){
    return this.m_episode;
  }

  public void setEpisode(int episode){
    this.m_episode = episode;
  }
  /**
  @toString Prints out Podcast 
  */
  public String toString(){
    return super.toString();
  }

}
