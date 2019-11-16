public class MovieQuote {
    //Instance Variables
    private String Quote;

    //Constructor with Params
    public MovieQuote(String Quote) {
        this.Quote = Quote;
    }

    //Getter
    public String getQuote() {
        return Quote;
    }

    public static void main(String[] args) {
        MovieQuote myobject = new MovieQuote("To be or not to be");
        System.out.println("My Movie Quote"+myobject.getQuote());
    }
}
