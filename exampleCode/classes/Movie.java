package exampleCode.classes;


public class Movie {
    private String title;
    private String genre;
    private int releaseYear;
    private boolean available;

    public Movie(String title, String genre, int releaseYear) {
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.available = true; // All movies start as available
    }

    // Getters and setters methods for accessing attributes
    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}