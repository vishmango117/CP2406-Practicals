public class MovieQuoteInfo {
    private String myquote;
    private String movie_name;
    private int movie_year;

    public MovieQuoteInfo(String myquote, String movie_name, int movie_year) {
        this.myquote = myquote;
        this.movie_name = movie_name;
        this.movie_year = movie_year;
    }

    public String getMyquote() {
        return myquote;
    }

    public String getMovie_name() {
        return movie_name;
    }

    public int getMovie_year() {
        return movie_year;
    }

    public static void main(String[] args) {
        MovieQuoteInfo shakespeare = new MovieQuoteInfo("Kopeng me sasa ke",
                "The Expanse", 2016);
        System.out.println("Movie Information:");
        System.out.println("Quote:"+shakespeare.getMyquote());
        System.out.println("Movie Name:"+shakespeare.getMovie_name());
        System.out.println("Movie Year:"+shakespeare.getMovie_year());
    }
}
