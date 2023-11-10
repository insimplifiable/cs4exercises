package exer3;

public class Song {
    private String song;
    private String artist;
    private int year;
    private String full;
    public Song(String song, String artist, int year) {
        this.song = song;
        this.artist = artist;
        this.year = year;
        full = song + " by " + artist + " (" + year + ")";
    }
    public String getFull() {
        return full;
    }
}
