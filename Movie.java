public class Movie {
    private String title;
    private int rating;
    private String type = "Move";

    public Movie (String title, int rating){
        this.title = title;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public int getRating() {
        return rating;
    }
}
