package hust.soict.hedspi.aims;
import java.util.Scanner;

import hust.soict.hedspi.aims.cart.Cart.Cart;
import hust.soict.hedspi.aims.media.Media.Book;
import hust.soict.hedspi.aims.media.Media.CompactDisc;
import hust.soict.hedspi.aims.media.Media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media.Media;
import hust.soict.hedspi.aims.store.Store.Store;

public class Aims {

    private static Scanner sc = new Scanner(System.in);
    private static Store store = new Store();
    private static Cart cart = new Cart();

    public static void main(String[] args) {
        // Thêm một DigitalVideoDisc vào cửa hàng
        store.insertMedia(new DigitalVideoDisc("DVD title", "DVD category", "DVD director", 10, 200.1f));
        
        // Đóng Scanner
        sc.close();
        
        // Khởi tạo và hiển thị giao diện quản lý cửa hàng
        StoreManagerScreen store_manager = new StoreManagerScreen(store);
    }
}