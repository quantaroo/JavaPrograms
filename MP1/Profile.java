
public class Profile{
  /**
  Private member variables to store a person’s name and age along with
  an array to store a record of other profiles that have swiped right on them,
  and a second array to store a record of matches
*/
  private String m_name;
  private int m_age;
  private Profile[] m_like = new Profile[10];
  private Profile[] m_match = new Profile[10];
  /**
  A default and overloaded constructor(s) that set the member variables.
*/
  public Profile(){
    m_name = "";
    m_age = 999;
  }
  public Profile(String name,int age){
    m_name = name;
    m_age = age;
  }
  /**
Public methods to mutate and access the member variables.
*/
  public String getName() {
    return m_name;
  }

  public void setName(String t) {
    m_name = t;
  }

  public int getAge() {
    return m_age;
  }

  public void setAge(int a) {
    m_age = a;
  }

  public Profile[] getLike(){
    return m_like;
  }

  public void setLike(Profile[] like,int n){
    m_like[n] = like;
  }

  public Profile[] getMatch(){
    return m_match;
  }

  public void setMatch(Profile[] match,int n){
    m_match[n] = match;
  }

  /**
A public method named toString( ) that returns a String containing an appropriate description
of the dating profile record.
*/
  public String toString() {
    return "--------------------------\n"
    + "\nName: " + m_name
    + "\nAge: " + m_age
    + "\nLikes: " + m_like
    + "\nMatches: " + m_match
    + "\n--------------------------";
  }
  /**
A public method named equals( ) that determines whether two profiles are the same and returns a boolean.
*/
  public boolean equals(Profile Profile1,Profile Profile2) {
    if (!(Profile1 instanceof Profile)) {
        return false;
    } else {
        Profile2 = Profile1;
        return true;
    }
  }
  /**
A public method swipeRight() that takes in an instance of another Profile and adds the current Profile to the
other Profile’s like array. If the Profile is already in the other like array,
add the Profile to the match array of both Profiles.
Be sure to make sure the position in the array you are inserting is null
(otherwise you will overwrite an existing match). If there is no room in one of the match arrays,
tell the user the match cannot be made.
*/
  public void swipeRight(Profile Profile1){
    for(int i=0;i<10;i++){
      if(Profile1 == m_like[i]){
        for(int j=0;j<=10;i++){
          if(m_match[j] == null){
            Profile1.setMatch(m_match,j);
            break;
          }
          if(m_match[j] != null){
            continue;
          }
          else{
            System.out.println("Match cannot be made.");
            break;
          }
        }
      }
      if(m_like[i] == null){
        Profile1.setLike(m_like,i);
        break;
      }
    }
  }
  /**
A public method swipeLeft() that takes in an instance of another dating profile and deletes
that profile from the current Profile’s like array. (It does nothing with the matched array)
*/
  public void swipeLeft(Profile Profile1){
    for(int i=0;i<10;i++){
      if(Profile1 == m_like[i]){
        m_like = null;
        break;
      }
      if(m_like[i] == null){
        break;
      }
    }
  }
  // public static void main(String[] args){
  //   Profile person1 = new Profile("Will Smith");
  //   Profile person2 = new Profile("Jada Smith");
  //
  //   person1.swipeRight(person2);
  //   //person 1 would be in person 2's like array,
  //   //but  both of their match arrays would be empty
  //   person2.swipeRight(person1);
  //   // now both of their match arrays include each other
  //
  //   // print out all of the profiles in their matches
  //   // to make sure the match occurred
  //   for (Profile p : person2.getMatch()) {
  //     System.out.println(p);
  //   }
  // }
}
