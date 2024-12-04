package hust.soict.ite6.oop.aims.media;

import java.util.Objects;

public class Track implements Playable {
    private String title;
    private int length;

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }
    
    

    public void play() {
        if (length > 0) {
        	System.out.println("Playing CD: " + this.getTitle() + " (" + this.getLength() + " mins)");
        } else {
            System.out.println("Track " + this.getTitle() + " cannot be played");
        }
    }
    
    public boolean equals(Object obj) {
    	if ( this == obj) return true;
    	if (obj == null || getClass() != obj.getClass()) return false; //NUll or different class
    	Track track = (Track) obj; //Safe cast to Track
    	return Objects.equals(title, track.title) && Objects.equals(length, track.length); // compare title + length
    	
    }
}

