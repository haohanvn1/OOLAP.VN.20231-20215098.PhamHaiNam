package hust.soict.hedspi.aims.media.Media;

import java.util.Scanner;

public class DigitalVideoDisc extends Disc implements Playable {
    private static int nbDigitalVideoDiscs = 0;

    // Overloading methods
    public DigitalVideoDisc(String category, String title, float cost) {
        super(nbDigitalVideoDiscs++, title, category, cost, 0, null);
    }

    public DigitalVideoDisc(String director, String category, String title, float cost) {
        super(nbDigitalVideoDiscs++, title, category, cost, 0, director);
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(nbDigitalVideoDiscs++, title, category, cost, length, director);
    }

    public DigitalVideoDisc(String title) {
        super(nbDigitalVideoDiscs++, title, null, 0, 0, null);
    }

    // Other methods
    public boolean isMatch(int id) {
        return (this.getId() == id);
    }

    public boolean isMatch(String searchTitle) {
        String[] keywords = this.getTitle().toLowerCase().split("\\s+");
        for (String word : keywords) {
            if (searchTitle.toLowerCase().equals(word.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }

    @Override
    public String toString() {
        return String.format("DVD - %s - %s - %s - %d : %.2f $", getTitle(), getCategory(), getDirector(), getLength(), getCost());
    }

    @Override
    public Media playMedia(String title) {
        // TODO Auto-generated method stub
        return null;
    }

    public static DigitalVideoDisc createDVD() {
        System.out.println("---New DVD---");
        String title, category, director;
        int length;
        float cost;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter title: ");
        title = sc.nextLine();

        System.out.print("Enter category: ");
        category = sc.nextLine();

        System.out.print("Enter director: ");
        director = sc.nextLine();

        System.out.print("Enter length: ");
        length = sc.nextInt();

        System.out.print("Enter cost: ");
        cost = sc.nextFloat();

        sc.close();
        return new DigitalVideoDisc(title, category, director, length, cost);
    }
}
