package movies;

public class Movie {
    private String name;
    private String category;

    //constructor
    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }
    //changes movie info
    public void setMovie(String name, String category) {
        this.name = name;
        this.category = category;
    }
    public String getName() {
        return this.name;
    }
    public String getCategory() {
        return this.category;
    }

}
