public class Cartoon extends Movie {
    private String title;
    private int rating;
    private String type = "Cartoon";

    public Cartoon(String title, int rating){
        super(title, rating);
        this.title = title;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }


    @Override
    public String getType() {
        return type;
    }

    @Override
    public int getRating() {
        return rating;
    }
}
