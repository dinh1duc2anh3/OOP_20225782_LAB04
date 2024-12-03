package hust.soict.ite6.oop.test.store;

import java.util.Arrays;

import hust.soict.ite6.oop.aims.media.Book;
import hust.soict.ite6.oop.aims.media.CompactDisc;
import hust.soict.ite6.oop.aims.media.DigitalVideoDisc;
import hust.soict.ite6.oop.aims.media.Track;
import hust.soict.ite6.oop.aims.store.Store;

public class StoreTest {

	public static void main(String[] args) {
		Store store = new Store();
		
		// Thêm CD vào Store	
        CompactDisc cd = new CompactDisc("Thriller", "Pop", 15.0f, "Michael Jackson", 0,"Quincy Jones");
        cd.addTrack(new Track("Wanna Be Startin' Somethin'", 6));
        cd.addTrack(new Track("Thriller", 7));
        cd.addTrack(new Track("Beat It", 5));
        cd.setLength();
       
        
        // Thêm book vào Cart
        Book book = new Book("Effective Java", "Programming", 45.0f, Arrays.asList("Joshua Bloch"));
        
        // Create some DigitalVideoDisc objects
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Inception", "Sci-Fi", 20.0f, "Christopher Nolan", 148);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Avatar", "Fantasy", 25.0f, "James Cameron", 162);
        
        
		store.addMedia(book,dvd1,dvd2);
		store.addMedia(cd);
		store.displayStore();
		
		store.removeMedia(dvd2);
		store.displayStore();
        
	}

}
