package hust.soict.hedspi.aims;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.util.List;

import hust.soict.hedspi.aims.media.Media.Media;
import hust.soict.hedspi.aims.store.Store.Store;

// Class StoreManagerScreen inherits from JFrame
public class StoreManagerScreen extends JFrame {
    private Store store;

    // Constructor takes a Store object
    public StoreManagerScreen(Store store) {
        this.store = store;

        // Setup GUI
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(createNorth(), BorderLayout.NORTH);
        cp.add(createCenter(), BorderLayout.CENTER);

        setTitle("Store");
        setSize(1024, 768);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // Create top part of the GUI
    JPanel createNorth() {
        JPanel north = new JPanel();
        north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
        north.add(createMenuBar());
        north.add(createHeader());
        return north;
    }

    // Create menu bar
    JMenuBar createMenuBar() {
        JMenu menu = new JMenu("Options");

        // Add menu items
        JMenuItem viewStoreItem = new JMenuItem("View store");
        menu.add(viewStoreItem);

        JMenu smUpdateStore = new JMenu("Update Store");
        JMenuItem addBookItem = new JMenuItem("Add Book");
        JMenuItem addCDItem = new JMenuItem("Add CD");
        JMenuItem addDVDItem = new JMenuItem("Add DVD");

        // Event handling for menu items
        addBookItem.addActionListener(e -> {
            // Code to add a book (not shown)
        });

        addCDItem.addActionListener(e -> {
            // Code to add a CD (not shown)
        });

        addDVDItem.addActionListener(e -> {
            // Code to add a DVD (not shown)
        });

        smUpdateStore.add(addBookItem);
        smUpdateStore.add(addCDItem);
        smUpdateStore.add(addDVDItem);
        menu.add(smUpdateStore);

        JMenuBar menuBar = new JMenuBar();
        menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
        menuBar.add(menu);

        return menuBar;
    }

    // Create header section
    JPanel createHeader() {
        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));

        JLabel title = new JLabel("AIMS");
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
        title.setForeground(Color.CYAN);

        header.add(Box.createRigidArea(new Dimension(10, 10)));
        header.add(title);
        header.add(Box.createHorizontalGlue());
        header.add(Box.createRigidArea(new Dimension(10, 10)));

        return header;
    }

    // Create center part containing the list of media
    JPanel createCenter() {
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(3, 3, 2, 2));

        List<Media> mediaInStore = store.getAllMedia(); // Assuming getAllMedia() method exists in Store class
        int size = mediaInStore.size();
        for (int i = 0; i < Math.min(size, 9); i++) {
            Media media = mediaInStore.get(i);
            JLabel mediaLabel = new JLabel(media.toString()); // Display media details
            center.add(mediaLabel);
        }

        return center;
    }

    // Main method to run the program
    public static void main(String[] args) {
        Store store = new Store();
        SwingUtilities.invokeLater(() -> new StoreManagerScreen(store));
    }
}
