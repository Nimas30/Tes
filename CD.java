//Object Class
package persewaan;

public class CD extends Product {
    private String artist;
    private int totalSong;
    private String label;

    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getTotalSong() {
        return this.totalSong;
    }

    public void setTotalSong(int totalSong) {
        this.totalSong = totalSong;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    // Constructor Parameter
    public CD(String artist, int totalSong, String label) {
        // variabel = parameter
        this.artist = artist;
        this.totalSong = totalSong;
        this.label = label;
    }

    public CD() {
        number = 10;
        name = "CD Selamat Siang";
        quantity = 100;
        price = 20000.0;
        artist = "Salman";
        totalSong = 50;
        label = "Sony Music";

    }

    // method print
    public void print() {
        System.out.println("Number :" + number);
        System.out.println("Name : " + name);
        System.out.println(" Artist yang ingin dicari : " + artist);
        System.out.println(" Quantity :" + quantity);
        System.out.println("Price : " + price);
        System.out.println("Total song : " + totalSong);
        System.out.println("Label : " + label);
    }

}
