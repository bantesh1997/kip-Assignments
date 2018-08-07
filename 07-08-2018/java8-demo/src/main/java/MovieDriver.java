
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class MovieDriver {
    public void displayMovies(List<Movie> list ){
        list.forEach(movie ->
                System.out.println("Movie:" + movie.getName() + "  Rating:" + movie.getRating() +
                        "  Release year: " + movie.getReleaseYear() + "  Genre: " + movie.getGenre()));
    }
    public static void main(String[] args) {
        MovieDriver movieViewer = new MovieDriver();
        Movie movie1 = new Movie("a", 2000, 9, "comedy");
        Movie movie2 = new Movie("b", 2005, 6, "Romance");
        Movie movie3 = new Movie("c", 2018, 5, "scary");
        Movie movie4 = new Movie("d", 2003, 7, "Sci-Fi");
        List<Movie> movieList = Arrays.asList(movie1, movie2, movie3, movie4);

        List<Movie>list1=movieList.stream()
                .filter(movie -> movie.getRating() > 8 && movie.getGenre().equals("comedy"))
                .collect(Collectors.toList());
        list1.forEach(movie ->
                System.out.println("Movie:" + movie.getName() + "  Rating:" + movie.getRating() +
                        "  Release year: " + movie.getReleaseYear() + "  Genre: " + movie.getGenre()));


        List<Movie>list2=movieList.stream()
                .filter(movie -> movie.getRating() < 8 && movie.getReleaseYear()>2000)
                .collect(Collectors.toList());
        list2.forEach(movie ->
                System.out.println("Movie:" + movie.getName() + "  Rating:" + movie.getRating() +
                        "  Release year: " + movie.getReleaseYear() + "  Genre: " + movie.getGenre()));




        List<Movie>list3=movieList.stream()
                .filter(movie -> movie.getRating()%2==0)
                .collect(Collectors.toList());
        list3.forEach(movie ->
                System.out.println("Movie:" + movie.getName() + "  Rating:" + movie.getRating() +
                        "  Release year: " + movie.getReleaseYear() + "  Genre: " + movie.getGenre()));



        List<Movie>list4=movieList.stream()
                .filter(movie -> movie.getRating() ==7 && movie.getGenre().equals("Sci-Fi"))
                .collect(Collectors.toList());
        list4.forEach(movie ->
                System.out.println("Movie:" + movie.getName() + "  Rating:" + movie.getRating() +
                        "  Release year: " + movie.getReleaseYear() + "  Genre: " + movie.getGenre()));


    }


}
