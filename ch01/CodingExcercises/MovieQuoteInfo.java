public class MovieQuoteInfo {
    private MovieQuote myquote;
    private String movie_name;
    private int movie_year;

    public MovieQuoteInfo(MovieQuote myquote, String movie_name, int movie_year) {
        this.myquote = myquote;
        this.movie_name = movie_name;
        this.movie_year = movie_year;
    }

    public MovieQuote getMyquote() {
        return myquote;
    }

    public String getMovie_name() {
        return movie_name;
    }

    public int getMovie_year() {
        return movie_year;
    }

    public static void main(String[] args) {
        MovieQuote shakespeare_quote = new MovieQuote("To Be or not to Be");
        MovieQuoteInfo shakespeare = new MovieQuoteInfo(shakespeare_quote, "Hamlet", 1645);
        System.out.println("Movie Information:");
        System.out.println("Quote:"+shakespeare.getMyquote());
        System.out.println("Movie Name:"+shakespeare.getMovie_name());
        System.out.println("Movie Year:"+shakespeare.getMovie_year());
    }
}
