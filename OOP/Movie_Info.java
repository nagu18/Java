class Movie {
    String Movie_Title;
    String time;
    int rating;
    void info(){
        System.out.println("Movie Title: "+ Movie_Title+"\n"+"Timeings: "+time+"\n"+"Rating: "+rating+"\n");
    }

}

public class Movie_Info{
  public static void main(String[] args){
    Movie Ironman = new Movie(); // declare object 
    Ironman.Movie_Title = "Iron Man"; //use the data of object
    Ironman.time = "1:30pm"; //use the data of object
    Ironman.rating = 5; //use the data of object
    Ironman.info(); // used the object method

    Movie Spiderman = new Movie();
    Spiderman.Movie_Title = "Spiderman"; // declare object 
    Spiderman.time = "2:00pm"; //use the data of object
    Spiderman.rating = 5; //use the data of object
    Spiderman.info(); //use the data of object
  }

}