public class FavoriteSong {
    private String song_lyrics;

    public FavoriteSong(String song_lyrics) {
        this.song_lyrics = song_lyrics;
    }

    public static void main(String[] args) {
        FavoriteSong myobject = new FavoriteSong("Never gonna give you up\n" +
                "Never gonna let you down\n" +
                "Never gonna run around and desert you\n" +
                "Never gonna make you cry\n" +
                "Never gonna say goodbye\n" +
                "Never gonna tell a lie and hurt you");

        System.out.println(myobject.song_lyrics);

    }

}
