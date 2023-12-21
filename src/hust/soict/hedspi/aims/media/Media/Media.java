package hust.soict.hedspi.aims.media.Media;

public abstract class Media {
    private int id;
    private String title;
    private String category;
    private float cost;

    public Media(int id, String title, String category, float cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    // Check if this media matches a given ID
    public boolean isMatch(int id) {
        return this.id == id;
    }

    // Check if this media's title matches a given title
    public boolean isMatch(String title) {
        return this.title != null && this.title.equalsIgnoreCase(title);
    }

    @Override
    public String toString() {
        return "Media{" +
               "id=" + id +
               ", title='" + title + '\'' +
               ", category='" + category + '\'' +
               ", cost=" + cost +
               '}';
    }
}
