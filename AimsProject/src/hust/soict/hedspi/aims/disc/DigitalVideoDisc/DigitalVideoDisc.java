package hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class DigitalVideoDisc {
private String title;
private String category;
private String director;
private int length;
private float cost;
private static int nbDigitalVideoDiscs = 0;
private int id;

public DigitalVideoDisc(String title) {
	super();
	this.title = title;
	nbDigitalVideoDiscs += 1;
	this.id = nbDigitalVideoDiscs;
}


public DigitalVideoDisc(String title, String category, float cost) {
	super();
	this.title = title;
	this.category = category;
	this.cost = cost;
	nbDigitalVideoDiscs += 1;
	this.id = nbDigitalVideoDiscs;
}

public DigitalVideoDisc(String title, String category, String director, float cost) {
	super();
	this.title = title;
	this.category = category;
	this.director = director;
	this.cost = cost;
	nbDigitalVideoDiscs += 1;
	this.id = nbDigitalVideoDiscs;
}

public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
	super();
	this.title = title;
	this.category = category;
	this.director = director;
	this.length = length;
	this.cost = cost;
	nbDigitalVideoDiscs += 1;
	this.id = nbDigitalVideoDiscs;
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

public void setTitle(String title) {
    this.title = title;
} public String toString() {
    return "DVD - " + "[" + title + "] - [" + category + "] - [" + director + "] - [" + length + "]: " + cost + " $";
}
public int getId() {
    return id;
}

public boolean isMatch(String title) {
   if( (this.title).equals(title) ) 
		return true;
	else return false;
}






}
