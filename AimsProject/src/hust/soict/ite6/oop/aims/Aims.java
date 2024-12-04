package hust.soict.ite6.oop.aims;

import hust.soict.ite6.oop.aims.cart.Cart;
import hust.soict.ite6.oop.aims.media.Book;
import hust.soict.ite6.oop.aims.media.CompactDisc;
import hust.soict.ite6.oop.aims.media.DigitalVideoDisc;
import hust.soict.ite6.oop.aims.media.Track;
import hust.soict.ite6.oop.aims.store.Store;
import javafx.scene.media.Media;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Aims {
    public static void main(String[] args) {
        Store store = new Store();
        Cart cart = new Cart();

        // Thêm book vào Store
        Book book = new Book("Effective Java", "Programming", 45.0f, Arrays.asList("Joshua Bloch"));
        
        // Thêm CD vào Store	
        CompactDisc cd = new CompactDisc("Thriller", "Pop", 15.0f, "Michael Jackson","Quincy Jones", 0);
        cd.addTrack(new Track("Wanna Be Startin' Somethin'", 6));
        cd.addTrack(new Track("Thriller", 7));
        cd.addTrack(new Track("Beat It", 5));
        cd.setLength(cd.getLength());
        store.addMedia(cd);
        
        // Thêm DVD vào Store
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Inception", "Sci-Fi", 20.0f, "Christopher Nolan", 148);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Avatar", "Fantasy", 25.0f, "James Cameron", 162);
        
        //Add a track
        Track track = new Track("Single Track", 3);
        
                
        

        store.addMedia(book, cd, dvd1, dvd2);
        
        store.displayStore();
        
     // Display the store sorted by title then cost
        store.displayStoreSortedByTitleThenCost();
        
        // Display the store sorted by cost then title
        store.displayStoreSortedByCostThenTitle();
        
        
//        //test Playable implementations
//        dvd1.play();
//        dvd2.play();
//        cd.play();
//        track.play();
//        
//        
//        // Thêm Media vào Cart
//        cart.addMedia(dvd1, dvd2);
//
//        // Hiển thị Store và Cart
//        store.displayStore();
//        cart.displayCart();
//
//        // Tìm kiếm Media
//        cart.search(1);
//        cart.search("Avatar");
    }
}
