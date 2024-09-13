package persewaan;
//subclass

public class DVD extends Product {
    private String length;
    private String movie;
    private String rating;
    private String studio;

    public String getLength() {
        return this.length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getMovie() {
        return this.movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public String getRating() {
        return this.rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getStudio() {
        return this.studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

   // Constructor Parameter
   public DVD(String length, String movie, String rating, String studio) {
    // variabel = parameter
    this.length = length;
    this.movie =movie;
    this.rating = rating;
    this.studio=studio;
}

   public DVD() {
    movie="The Terminal";
    number=0;
    name="Tom Hanks";
    quantity= 12;
    price= 99.000;
    length="2 hours";
    rating= "17+";
    studio= "HBO studio";

   }

    // method print
    public void print() {
        System.out.println("Movie : " +movie);
        System.out.println("Number :" + number);
        System.out.println("Name : " + name);
        System.out.println(" Quantity :" + quantity);
        System.out.println("Price : " + price);
        System.out.println("Length: " + length);
        System.out.println("Rating : " + rating);
        System.out.println("Studio : " +studio);
    }
    
}
