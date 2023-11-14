/**
 * Activity 2.5.7
 * 
 * A MediaLib class for the MediaLibrary program
 */
public class MediaLib
{
  private Book book;
  private Movie movie;
  private Song song;
  public static String owner = "PLTW";
  private static int numEntries = 0;


public static int getNumEntries(){
  return MediaLib.numEntries;
  // System.out.println("Test: Owner is " + owner);
  // System.out.println("Test: Book is " + book);
  // System.out.println("Test: MediaLib is " + this.book);
}
  
  public static String getOwner(){
    return MediaLib.owner;
  }

  public static void changeOwner(String newOwner){
    MediaLib.owner = newOwner;
  } 
  
  public void addBook(Book b)
  {
    if (book == null) {
    book = b;
      numEntries++;
    }
    else{
    System.out.println("Library already has a book.");
    }
  }

  public void addSong(Song s)
  {
    if (song == null) {
    song = b;
      numEntries++;
    }
    else{
    System.out.println("Library already has a song.");
    }
  }

  public void addMovie(Movie a)
  {
    if (movie == null) {
      movie = a;
      numEntries++;
    }
    else{
      System.out.println("Library already has a movie.");
    }
    
  }

  public String toString() {
  String info = "The current book in the library is: " + book.getTitle() + " by " + book.getAuthor();
  if (movie != null) {
    info += "\nThe current movie in the library is: " + movie.getTitle() + " with a duration of " + movie.getDuration() + " hours";
  }
    if (song != null) {
      info += "\nThe current song in the library is: " + song.getTitle() + " with a duration of " + movie.getDuration() + " hours";
    }
  return info;
  }

  // void testBook(Book tester){
  //   tester.setTitle("test");
  //   System.out.println(tester);
  // }

  
}