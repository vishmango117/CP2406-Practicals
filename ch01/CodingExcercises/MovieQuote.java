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
        MovieQuote myobject = new MovieQuote("Tonight We shall cancel the apocalypse");
        System.out.println("My Movie Quote: "+myobject.getQuote());
    }
}
