package Game;

public class Game {
    private String title;
    private Integer rating;
    private String genre;
    private Integer releaseDate;
    private double price;

    public Game(String title, Integer rating, String genre, Integer releaseDate, double price) {
        this.price = price;
        this.title = title;
        this.rating = rating;
        this.genre = genre;
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getRating() {
        return this.rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getReleaseDate() {
        return this.releaseDate;
    }

    public void setReleaseDate(Integer releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Game) {
            Game g = (Game) obj;
            return g.getTitle().equals(g.getTitle());
        }
        return false;
    }

}
