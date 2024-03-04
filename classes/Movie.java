package classes;
import interfaces.IMovie;

public class Movie implements IMovie {
    private int id;
    private static int countId = 0;
    private String title;
    private String genre;
    private int releaseYear;
    private boolean avaliable;

    private Movie(String title, String genre, int releaseYear) {
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.avaliable = true;
        this.id = ++countId;
    }

    @Override
    public void print() {
        System.out.println(id+". "+ title +" - "+ genre +" - "+ releaseYear);
    }
    public static Movie make(String title, String genre, int releaseYear) {
        Movie movie = new Movie(title, genre, releaseYear);
        return movie;
    }

}
