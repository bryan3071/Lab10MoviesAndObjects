package Lab10MoviesAndObjects2;
import java.util.Scanner;
public class MovieApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Welcome to the Movie List Application!");
		System.out.println();
		System.out.println("There are 10 movies in this list");
		
		
		String title = null;
	       String category = null;
	       String keepGoing = "y";
	       while (keepGoing.equalsIgnoreCase("y")) {
	      
	       System.out.println("What category are you interested in?");
	       System.out.println("Choose between drama, horror, science fiction, cartoon, adventure and comedy");
	       Movies newMovie = new Movies(title,category);
	      category = scnr.nextLine().toLowerCase();
	       newMovie.setCategory(category);

	       System.out.println(Movies.getMovies(category).toString());

	       System.out.println("Do you want to ask about another movie? (y/n)");
	       keepGoing = scnr.nextLine();
	       }
	   

	   System.out.println("OK Thanks for using the Movies List Application! Goodbye!");
	   scnr.close();

	}
}


