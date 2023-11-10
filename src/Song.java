public class Song {
    String song;
    String artist;
    int year;
    String full;
    public Song(String s, String a, int y) {
        song = s;
        artist = a;
        year = y;
        full = song + " by " + artist + " (" + year + ")";
    }
}
