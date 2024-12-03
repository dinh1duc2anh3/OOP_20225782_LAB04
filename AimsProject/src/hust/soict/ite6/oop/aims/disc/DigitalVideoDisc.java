package hust.soict.ite6.oop.aims.media;

public class DigitalVideoDisc extends Media {
    private String director;
    private int length;

    // Constructor
    public DigitalVideoDisc(String title, String category, float cost, String director, int length) {
        super(title, category, cost);
        this.director = director;
        this.length = length; 
    }

    @Override
    public String toString() {
        return super.toString() + ", Director: " + director + ", Length: " + length;
    }
}