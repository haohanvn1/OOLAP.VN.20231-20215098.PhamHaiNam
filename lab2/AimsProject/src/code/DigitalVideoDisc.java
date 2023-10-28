package code;

public class DigitalVideoDisc {
private String title;
private String category;
private int length;
private float cost;
public DigitalVideoDisc(String category, String title, float cost) {
    this.category = category;
    this.title = title;
    this.cost = cost;
    this.id = ++nbDigitalVideoDiscs;
}
public DigitalVideoDisc(String director, String category, String title, float cost) {
    this.director = director;
    this.category = category;
    this.title = title;
    this.cost = cost;
    this.id = ++nbDigitalVideoDiscs;
}
public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
    this.title = title;
    this.category = category;
    this.director = director;
    this.length = length;
    this.cost = cost;
    this.id = ++nbDigitalVideoDiscs;
}
public DigitalVideoDisc(String title) {
	super();
	this.title = title;
	this.id = ++nbDigitalVideoDiscs;
}
public String getTitle() {
    return title;
}

public String getCategory() {
    return category;
}

public String getDirector() {
    return director;
}

public int getLength() {
    return length;
}

public float getCost() {
    return cost;
}
}