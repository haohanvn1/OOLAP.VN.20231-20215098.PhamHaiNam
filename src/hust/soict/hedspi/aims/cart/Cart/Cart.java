package hust.soict.hedspi.aims.cart.Cart;


import java.util.List;
import java.util.LinkedList;
import java.util.Comparator;
import hust.soict.hedspi.aims.media.Media.Media;
import hust.soict.hedspi.aims.media.Media.Playable;

public class Cart implements Playable {
    private List<Media> mediaList = new LinkedList<>();

    // Display all items in the cart
    public void displayCartContents() {
        float total = 0;
        for (Media item : mediaList) {
            if (item != null) {
                System.out.println("Item: " + item.getTitle() + " | " + item.getCategory() + " | " + item.getCost() + " $");
                total += item.getCost();
            }
        }
        System.out.println("Total Cost: " + total);
    }

    // Display a specific media's details
    public void showMediaDetails(Media media) {
        if (media != null) {
            System.out.println("Item: " + media.getTitle() + " | " + media.getCategory() + " | " + media.getCost() + " $");
        }
    }

    // Find media by ID
    public void findMediaById(int id) {
        for (Media item : mediaList) {
            if (item != null && item.isMatch(id)) {
                System.out.println("Media with ID " + id + " found:");
                System.out.println(item);
                return;
            }
        }
        System.out.println("No media with ID " + id + " found in cart.");
    }

    // Find media by title
    public void findMediaByTitle(String title) {
        for (Media item : mediaList) {
            if (item != null && item.isMatch(title)) {
                System.out.println("Media containing title '" + title + "' found:");
                System.out.println(item);
                return;
            }
        }
        System.out.println("No media with title '" + title + "' found in cart.");
    }

    // Calculate total cost
    public float calculateTotalCost() {
        return mediaList.stream()
                        .map(Media::getCost)
                        .reduce(0.0f, Float::sum);
    }

    // Add a media item to the cart
    public void addMediaItem(Media media) {
        if (!mediaList.contains(media)) {
            mediaList.add(media);
            System.out.println("Media added to cart.");
        } else {
            System.out.println("This media is already in the cart.");
        }
    }

    // Add multiple media items
    public void addMultipleMedia(Media... mediaItems) {
        for (Media item : mediaItems) {
            addMediaItem(item);
        }
    }

    // Remove a media item from the cart
    public void removeMediaItem(Media media) {
        if (mediaList.remove(media)) {
            System.out.println("Media removed from cart.");
        } else {
            System.out.println("Media not found in cart.");
        }
    }

    // Sort the cart by title
    public void sortCartByTitle() {
        mediaList.sort(Comparator.comparing(Media::getTitle).thenComparing(Media::getCost));
    }

    // Sort the cart by cost
    public void sortCartByCost() {
        mediaList.sort(Comparator.comparing(Media::getCost).thenComparing(Media::getTitle));
    }

    // Play media based on title
    public Media playSpecificMedia(String title) {
        return mediaList.stream()
                .filter(media -> media.isMatch(title))
                .findFirst()
                .orElse(null);
    }

    // Confirm order
    public void confirmOrder() {
        System.out.println("Order has been placed.");
    }

    @Override
    public void play() {
        // Implementation of Playable interface's play method
        // Not required in this context
    }

	@Override
	public Media playMedia(String title) {
		// TODO Auto-generated method stub
		return null;
	}
}
