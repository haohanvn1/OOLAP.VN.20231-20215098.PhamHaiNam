package hust.soict.hedspi.test.store.StoreTest;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc.DigitalVideoDisc;
import hust.soict.hedspi.aims.store.Store.Store;


public class StoreTest {

    public static void main(String[] args) {
    		Store store = new Store();
    		
    		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.85f);
    		store.addMedia(dvd1);
    		
    		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "Geogre Lucas", 87, 24.95f);
    		store.addMedia(dvd2);
    		
    		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 24.95f);
    		store.addMedia(dvd3);
    		store.removeMedia(dvd2);
    		
    	}
}
	

