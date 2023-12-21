package hust.soict.hedspi.aims.media.Media;

public class Disc extends Media {
    private String director;
    private int length;

    // Constructors
    public Disc() {
        super(0, null, null, 0.0f);
    }

    public Disc(int id, String title, String category, float cost, int length, String director) {
        super(id, title, category, cost);
        this.length = length;
        this.director = director;
    }

    public Disc(String title) {
        super(0, title, null, 0.0f);
    }

    public Disc(String director, String category, String title, float cost) {
        super(0, title, category, cost);
        this.director = director;
    }

    public Disc(String category, String title, float cost) {
        super(0, title, category, cost);
    }

    public Disc(String title, String category, float cost, int length, String director) {
        super(0, title, category, cost);
        this.length = length;
        this.director = director;
    }

    // Getters and setters
    public String getDirector() {
        return this.director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
