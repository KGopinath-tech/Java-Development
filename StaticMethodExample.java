
class Movie{
        String movieName;
        static String actorName;
        int yearOfRelease;

        public void showMovieDetails(){
            System.out.println(movieName + " : "+ actorName + " : " + yearOfRelease);
        }
        public static void showMovieAndActorName(Movie movie){
            System.out.println("Movie Name is : " + movie.movieName + " and Actor Name is : " + actorName);
            // we can't access non static variable inside static method, 
            // we need to pass object reference to method and access non static variable using object reference.
        }
    }

public class StaticMethodExample {

    public static void main(String[] a){
        
        Movie leo = new Movie();
        leo.movieName="LEO";
        Movie.actorName="Vijay";
        leo.yearOfRelease=2023;

        Movie master = new Movie();
        master.movieName="Master"; 
        Movie.actorName="Vijay";
        master.yearOfRelease=2021;

        leo.showMovieDetails();
        master.showMovieDetails();  

        Movie.showMovieAndActorName(leo);

    }
}