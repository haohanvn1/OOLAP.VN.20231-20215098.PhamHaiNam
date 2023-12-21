package hust.soict.hedspi.aims.store.Store;
import java.util.List;
import java.util.LinkedList;
import hust.soict.hedspi.aims.media.Media.Media;
import hust.soict.hedspi.aims.media.Media.Playable;

public class Store implements Playable {
    private List<Media> mediaCollection = new LinkedList<>();

    // Add a new media item to the store
    public void insertMedia(Media media) {
        if (!mediaCollection.contains(media)) {
            mediaCollection.add(media);
            System.out.println("Media successfully added to the store.");
        } else {
            System.out.println("This media already exists in the store.");
        }
    }

    // Remove an existing media item from the store
    public void deleteMedia(Media media) {
        if (mediaCollection.remove(media)) {
            System.out.println("Media removed from the store.");
        } else {
            System.out.println("Media not found in the store.");
        }
    }

    // Search for a media by its title
    public boolean findMediaByTitle(String title) {
        return mediaCollection.stream()
                .filter(media -> media.getTitle().equalsIgnoreCase(title))
                .peek(media -> System.out.println("Found media: " + media))
                .findFirst()
                .isPresent();
    }

    // Display all media items in the store
    public void listAllMedia() {
        mediaCollection.forEach(media -> System.out.println("Media details: " + media));
    }

    // Play a media based on its title
    public Media playSpecificMedia(String title) {
        return mediaCollection.stream()
                .filter(media -> media.getTitle().equalsIgnoreCase(title))
                .peek(media -> System.out.println("Now playing: " + media))
                .findFirst()
                .orElse(null);
    }

    // Retrieve all media items
    public List<Media> getAllMedia() {
        return new LinkedList<>(mediaCollection);
    }

    @Override
    public void play() {
        // Implementation of the Playable interface's play method
        // This could be a generic play functionality for the store
    }

	@Override
	public Media playMedia(String title) {
		// TODO Auto-generated method stub
		return null;
	}
}