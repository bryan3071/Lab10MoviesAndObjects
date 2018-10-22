package Lab10MoviesAndObjects2;
import java.util.ArrayList;
public class Movies {

	private String title;
	   private String category;

	   public Movies(String title, String category) {
	       this.title = title;
	       this.category = category;
	       // handling title and category
	   }

	   public String getTitle() {
	       return title;
	   }

	   public void setTitle(String title) {
	       this.title = title;
	       // getting and setting title
	   }

	   public String getCategory() {
	       return category;
	   }

	   public void setCategory(String category) {
	       this.category = category;
	       
	       //getting and setting category
	   }

	   public String toString(){
	       return title;
	
}
	   
	   private static ArrayList<Movies> allMovies = new ArrayList<>(10);

		public static ArrayList<Movies> getAllMovies() {
		   allMovies.add(new Movies("Jaws", "drama"));
		   allMovies.add(new Movies("Nightmare on Elm Street", "horror"));
		   allMovies.add(new Movies("Friday the 13th", "horror"));
		   allMovies.add(new Movies("Star Wars", "science fiction"));
		   allMovies.add(new Movies("Space Jam", "cartoon"));
		   allMovies.add(new Movies("The Godfather", "drama"));
		   allMovies.add(new Movies("Gone With The Wind", "drama"));
		   allMovies.add(new Movies("The Wizard of Oz", "adventure"));
		   allMovies.add(new Movies("Saving Private Ryan", "drama"));
		   allMovies.add(new Movies("Anchorman: The Legend of Ron Burgundy", "comedy"));
		   

		   return allMovies; //setting the list and categories of movies
		}
		
		public static ArrayList<Movies> getMovies(String category) {
			   if (allMovies.isEmpty()) {
			       getAllMovies();
			   }

			   ArrayList<Movies> movies = new ArrayList<>();
			   
			   
			   if (category == null) {
			       return movies;
			   }

			   for (Movies movie : allMovies) {
			       if (movie.getCategory().equals(category)) {
			           movies.add(movie);
			       }
			   }

			   return movies;
			 //just return the movies from the requested categories
			}
	   
	   
}
