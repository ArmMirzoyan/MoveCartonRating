import java.util.*;

public class Main {



    public static void main (String[] args){
        Movie movie1 = new Movie("Tghamardik", (int) (Math.random() * 10));
        Movie movie2 = new Movie("Mayrik", (int) (Math.random() * 10));
        Movie movie3 = new Movie("Tteni", (int) (Math.random() * 10));
        Movie movie4 = new Movie("Troy", (int) (Math.random() * 10));
        Movie movie5 = new Movie("1984", (int) (Math.random() * 10));

        Movie cartoon1 = new Cartoon("Tom & Jerry", (int) (Math.random() * 10));
        Movie cartoon2 = new Cartoon("Up", (int) (Math.random() * 10));
        Movie cartoon3 = new Cartoon("WALL-E", (int) (Math.random() * 10));
        Movie cartoon4 = new Cartoon("Nemo", (int) (Math.random() * 10));
        Movie cartoon5 = new Cartoon("Shrek", (int) (Math.random() * 10));
        Movie cartoon6 = new Cartoon("Madagascar", (int) (Math.random() * 10));
        Movie cartoon7 = new Cartoon("Mowgli", (int) (Math.random() * 10));

        List<Movie> list = Arrays.asList(movie1, movie2, movie3, movie4, movie5, cartoon1,
                cartoon2, cartoon3, cartoon4, cartoon5, cartoon6, cartoon7);

        for(Movie m : list){
            System.out.println(m.getTitle() + " " + m.getRating());
        }

        Rating rt = new Rating();
        ArrayList<String> bestFilmNames = new ArrayList<String>();
        bestFilmNames.add("Default");
        for(Movie m : list){
            if(m.getType() == "Move"){
                if(rt.getMaxRating() < m.getRating()){
                    bestFilmNames.set(0, m.getTitle());
                    rt.setMaxRating(m.getRating());
                } else if (rt.getMaxRating() == m.getRating()){
                    bestFilmNames.add(m.getTitle());
                }
            }
        }
        System.out.println("*********");
        System.out.println(bestFilmNames);




    }


}
