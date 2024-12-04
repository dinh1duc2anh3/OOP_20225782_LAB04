package hust.soict.ite6.oop.aims.media;

import java.util.Objects;

public abstract class Media {
    private int id;
    private String title;
    private String category;
    private float cost;
    
    public static int nbMedia =0;

    public Media(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.id = ++nbMedia;
    }
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public float getCost() {
        return cost;
    }
    //just to test using git
    

    public abstract void displayDetails();

    public abstract void play();
    
    public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false; // Null or different class
		Media media = (Media) obj; //safe cast to Media
		return Objects.equals(title, media.title);
    }

    
}