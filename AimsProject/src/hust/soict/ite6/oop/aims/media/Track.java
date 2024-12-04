package hust.soict.ite6.oop.aims.media;



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
}

