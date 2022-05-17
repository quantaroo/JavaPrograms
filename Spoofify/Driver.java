import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.io.*;
public class Driver{
  public static void main(String[] args){
    //Initial ArrayList to call back for
    ArrayList<Collection> Collect = new ArrayList<Collection>();
    ArrayList<Account> Accounts = new ArrayList<Account>();
    ArrayList<Content> Contents = new ArrayList<Content>();

    //Rock Playlist
    ArrayList<String> genre1 = new ArrayList<String>();
    genre1.add("80's Rock");
    Artist Scorpian = new Artist("Scorpian");
    Artist Journey = new Artist("Journey");
    Artist AcDc = new Artist("AC/DC");
    Artist Europe = new Artist("Europe");
    Song song1 = new Song("Hurrican",genre1,Scorpian, 2);
    Song song2 = new Song("Don't Stop Beleiving",genre1,Journey, 4);
    Song song3 = new Song("Thunderstruck",genre1,AcDc, 3);
    Song song4 = new Song("Final Countdown",genre1,Europe, 1);
    Song song5 = new Song("Black in Black",genre1,AcDc, 8);
    Song song6 = new Song("Don't Stop Beleiving",genre1,AcDc, 5);
    ArrayList<Content> rock = new ArrayList<Content>();
    rock.add(song1);rock.add(song2);rock.add(song3);rock.add(song4);rock.add(song5);rock.add(song6);
    Playlist RockHits = new Playlist("Rock Hits",rock);
    Collect.add(RockHits);

    //Pop Playlist
    ArrayList<String> genre2 = new ArrayList<String>();
    genre2.add("Pop");
    Artist Justin = new Artist("Justin Bieber");
    Artist Weekend = new Artist("The Weekend");
    Song song7 = new Song("Ghost",genre2,Justin, 3);
    Song song8 = new Song("Peaches",genre2,Justin, 5);
    Song song9 = new Song("Stay",genre2,Justin, 4);
    Song song10 = new Song("Blinding Lights",genre2,Weekend,2);
    Song song11 = new Song("Save Your Tears",genre2,Weekend, 6);
    ArrayList<Content> pop = new ArrayList<Content>();
    pop.add(song7);pop.add(song8);pop.add(song9);pop.add(song10);pop.add(song11);
    Playlist PopHits = new Playlist("Pop Hits",pop);
    Collect.add(PopHits);

    //Bruno Mars Unorthodox Jukebox Album
    ArrayList<String> genre3 = new ArrayList<String>();
    genre3.add("Pop");
    Artist Bruno = new Artist("Bruno Mars");
    Song song12 = new Song("Young Girls",genre3,Bruno, 10);
    Song song13 = new Song("Locked out of Heaven",genre3,Bruno, 1);
    Song song14 = new Song("Gorilla",genre3,Bruno, 9);
    Song song15 = new Song("Treasure",genre3,Bruno, 2);
    Song song16 = new Song("Moonshine",genre3,Bruno, 8);
    Song song17 = new Song("When I Was Your Man",genre3,Bruno, 3);
    Song song18 = new Song("Natalie",genre3,Bruno, 7);
    Song song19 = new Song("Show Me",genre3,Bruno, 4);
    Song song20 = new Song("Money Make Her Smile",genre3,Bruno, 6);
    Song song21 = new Song("If I Knew",genre3,Bruno, 5);
    ArrayList<Content> brun = new ArrayList<Content>();
    brun.add(song12);brun.add(song13);brun.add(song14);brun.add(song15);brun.add(song16);brun.add(song17);brun.add(song18);
    brun.add(song19);brun.add(song20);brun.add(song21);
    Album Unorth = new Album("Unorthodox Jukebox Album",brun);
    Collect.add(Unorth);

    //Podcast Playlist
    ArrayList<String> genre4 = new ArrayList<String>();
    genre4.add("Podcast");
    Artist Joe = new Artist("Joe Rogan");
    Podcast pod1 = new Podcast("Episode 1",genre4,Joe,3,1);
    Podcast pod2 = new Podcast("Episode 2",genre4,Joe,1,2);
    Podcast pod3 = new Podcast("Episode 3",genre4,Joe,2,3);
    ArrayList<Content> pod = new ArrayList<Content>();
    pod.add(pod1);pod.add(pod2);pod.add(pod3);
    Playlist PodJoe = new Playlist("Joe Rogan Podcast Playlist",pod);
    Collect.add(PodJoe);

    //Introductions and Options
    System.out.println("");
    System.out.println("Welcome to Spoofify!");
    System.out.println("Pick one of the following corrisponding numbers:");
    System.out.println("1   Create a listener account");
    System.out.println("2   List all Playlists and Albums available to shuffle");
    System.out.println("3   Add songs to an existing playlist");
    System.out.println("4   Export all songs on the plattform out to a file in ascending order by times streamed");
    System.out.println("5   Exit Program");
    System.out.println("");

    //User Input with the options
    Scanner num = new Scanner(System.in);
    int number = num.nextInt();

    //While loop to continue options
    while (number!=5){
      if(number == 1){
        //Create a Listner
        System.out.println("What is your name? ");
        Scanner num1 = new Scanner(System.in);
        String name = num1.nextLine();
        Listener listener = new Listener(name);
        Accounts.add(listener);
        System.out.println("");
        System.out.println("Here is your account:");
        System.out.println(listener);
      }
      else if(number == 2){
        //Populates the different Collections
        System.out.println("Here are the Playlists/Album in Spoofify: ");
        for(int i=0; i<Collect.size(); ++i){
          System.out.println(i+"   "+Collect.get(i).getTitleCol());
        }
        System.out.println("Which collection corresponding number do you choose to shuffle? (Must be number)");
        Scanner nu = new Scanner(System.in);
        int number2 = nu.nextInt();
        //feedback on what the user picked
        System.out.println("You picked: ");
        System.out.println(number2+"   "+Collect.get(number2).getTitleCol());
        System.out.println("");
        //Shows the shuffled song
        System.out.println("This is your song :D");
        System.out.println(Collect.get(number2).shuffle());
      }
      else if(number == 3){
        System.out.println("Here are the Playlists/Album in Spoofify: ");
        for(int i=0; i<Collect.size(); ++i){
          System.out.println(i+"   "+Collect.get(i).getTitleCol());
        }
        //Which collection do you want to add a song?
        System.out.println("Which collection corresponding number do you choose? (Must be number)");
        Scanner num3 = new Scanner(System.in);
        int number1 = num3.nextInt();
        //feedback on what the user picked
        System.out.println("You picked: ");
        System.out.println(number1+"   "+Collect.get(number1).getTitleCol());
        System.out.println("");

        if(number1==3){
          System.out.println("Do you want to add a podcast?");
          Scanner num4 = new Scanner(System.in);
          String str = num4.nextLine();

          if(str.toUpperCase().equals("YES")){
            //Questions on input variables for podcast
            System.out.println("What is the title of the podcast?");
            Scanner num5 = new Scanner(System.in);
            String str1 = num5.nextLine();
            System.out.println("What is the genre of the podcast?");
            String str2 = num5.nextLine();
            ArrayList<String> genre5 = new ArrayList<String>();
            genre5.add(str2);
            System.out.println("Who is the Artist of the podcast?");
            String str3 = num5.nextLine();
            Artist newArtist = new Artist(str3);
            System.out.println("Which number episode is the podcast?");
            int number3 = num5.nextInt();
            //Put variables into collect ArrayList
            Podcast newSong = new Podcast(str1,genre5,newArtist,0,number3);
            (Collect.get(number1)).getListCol().add(newSong);
          }
        }
        else if(number1==0||number1==1){
          System.out.println("Do you want to add a song?");
          Scanner num4 = new Scanner(System.in);
          String str = num4.nextLine();

          if(str.toUpperCase().equals("YES")){
            //Questions on input variables for song
            System.out.println("What is the title of the song?");
            Scanner num6 = new Scanner(System.in);
            String str1 = num6.nextLine();
            System.out.println("What is the genre of the song?");
            String str2 = num6.nextLine();
            ArrayList<String> genre5 = new ArrayList<String>();
            genre5.add(str2);
            System.out.println("Who is the Artist of the song?");
            String str3 = num6.nextLine();
            Artist newArtist1 = new Artist(str3);
            //Put variables into collect ArrayList
            Song newSong1 = new Song(str1,genre5,newArtist1,0);
            (Collect.get(number1)).getListCol().add(newSong1);
          }
        }
        else{
          System.out.println("Either you can't add to an Album or you input an invalid number");
        }

        System.out.println("");
        System.out.println(Collect.get(number1));

      }

      else if(number == 4){
        //Sorts the both the Content and Collection inside Content Array
        Collections.sort(Collect);
        for(int i=0;i<Collect.size(); ++i){
          Collections.sort(Collect.get(i).getListCol());
        }
        //Outputs Content to the Output.txt file
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new FileWriter("./Output.txt", true));
            writer.println(Collect);

        } catch (FileNotFoundException e) {
            System.err.println("We couldn't find that file.");
        }
        catch (IOException e) {
            System.out.println("Error reading or writing to a file.");
        }
        finally {
            if (writer != null) {
                writer.close();
            }
        }
      }
      else{
        System.out.println("Wrong entry. Please try again");
      }
      //Loops back and asks what other option you want
      System.out.println("");
      System.out.println("Pick one of the following corrisponding numbers:");
      System.out.println("1   Create a listener account");
      System.out.println("2   Lists all Playlists and Albums available to shuffle");
      System.out.println("3   Add songs to an existing playlist");
      System.out.println("4   Export all songs on the plattform out to a file in ascending order by times streamed");
      System.out.println("5   Exit Program");
      System.out.println("");

      num = new Scanner(System.in);
      number = num.nextInt();
    }
  }
}
