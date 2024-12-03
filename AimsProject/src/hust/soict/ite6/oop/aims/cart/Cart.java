package hust.soict.ite6.oop.aims.cart;


import java.util.ArrayList;

import hust.soict.ite6.oop.aims.media.Media;

public class Cart {
	public static final int MAX_NUBMERS_ORDERED = 20; //mamximum number of media in a cart
	ArrayList<Media> itemsOrdered = new ArrayList<Media>(MAX_NUBMERS_ORDERED);
		//(list of media )array
	
	// add 1 or more media into cart
	public void addMedia(Media ... medias) {
		System.out.println("***********************ADD***********************");
		// if quantity is not max yet, then still can add
		for (Media media : medias) {
			if (itemsOrdered.size() < MAX_NUBMERS_ORDERED) {
				itemsOrdered.add(media);
                System.out.println("The media " + media.getTitle() + " has been added into cart");
			}
			else {
				System.out.println("The cart is full, can't add " + media.getTitle());
                break;
			}
		}
	}

	
	public void removeMedia(Media media) {
		System.out.println("***********************REMOVE***********************");
		if (itemsOrdered.remove(media)) {
			itemsOrdered.remove(media);
            System.out.println("The media " + media.getTitle() + " has been removed.");
        }
		else {
			System.out.println("The media " + media.getTitle() + " is not in the cart");
		}
	}
	
	
	//calculate total cost
	public float totalCost() {
		float totalCost = 0;
		for (Media media : itemsOrdered ) {
			totalCost += media.getCost();
		}
		return totalCost;
	}
	
	public void displayCart() {
		System.out.println("***********************CART***********************");
        for (Media media : itemsOrdered) {
            media.displayDetails();
            System.out.println();
        }
        System.out.println("Total cost: " + totalCost());
	}
	
	
	public void search(int id) {
		System.out.println("**********************SEARCH************************");
		boolean found = false;
		for (Media media : itemsOrdered) {
			if (media.getId() == id) {
				media.displayDetails();
				found = true;
				break;
			}
		}
		 if (!found) System.out.println("No media found with ID = " + id);
	}
	
	public void search(String title) {
		System.out.println("**********************SEARCH************************");
		boolean found = false;
		for (Media media : itemsOrdered) {
			if (media.getTitle().equalsIgnoreCase(title)) {
				media.displayDetails();
				found = true;
				break;
			}
		}
		if (!found) System.out.println("No media found with title = " + title);
	}
	
}
