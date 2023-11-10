public class Singer {
    String name;
    int noOfPerformances = 0;
    double earnings = 0;
    Song favSong;
    public Singer(String n, Song s) {
        name = n;
        favSong = s;
    }
    public void performForAudience(int p) {
        noOfPerformances++;
        earnings += p*100;
    }
    public void changeFavSong(Song f){
        favSong = f;
    }
}