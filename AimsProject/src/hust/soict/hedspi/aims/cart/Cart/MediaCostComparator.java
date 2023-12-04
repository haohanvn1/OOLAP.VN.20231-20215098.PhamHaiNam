package hust.soict.hedspi.aims.cart.Cart;

import java.util.Comparator;

import hust.soict.hedspi.aims.media.Media.Media;


public class MediaCostComparator implements Comparator<Media> {
    @Override
    public int compare(Media media1, Media media2) {
        int costComparison = Float.compare(media2.getCost(), media1.getCost());
        if (costComparison != 0) {
            return costComparison;
        } else {
            return media1.getTitle().compareTo(media2.getTitle());
        }
    }
}
