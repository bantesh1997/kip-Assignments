
public class Movie  {
    private String name;
    private Integer releaseYear;
    private Integer rating;
    private String genre;
    public Movie(String name,Integer releaseYear,Integer rating,String genre)
    {
        this.name=name;
        this.releaseYear=releaseYear;
        this.rating=rating;
        this.genre=genre;
    }
    String getName(){
        return this.name;
    }

    int getReleaseYear(){
        return this.releaseYear;
    }

    Integer getRating(){
        return this.rating;
    }

    String getGenre(){
        return this.genre;
    }

}
