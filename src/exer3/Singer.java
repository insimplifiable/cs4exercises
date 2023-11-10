package exer3;

public class Singer {
    private String name;
    private int noOfPerformances = 0;
    private double earnings = 0;
    private Song favSong;
    private static int totalPerformances = 0;
    public Singer(String name, Song song) {
        this.name = name;
        this.favSong = song;
    }
    public void performForAudience(int earnings) {
        noOfPerformances++;
        totalPerformances++;
        this.earnings += earnings*100;
    }
    public void performForAudience(Singer singer, Song song, int earnings) {
        noOfPerformances++; singer.noOfPerformances++;
        totalPerformances++;
        this.earnings += earnings*50;
        singer.earnings += earnings*50;
        System.out.println("\n" + getName() + " and " + singer.getName() + " perform " + song.getFull() + ".");
    }
    public String getName() {
        return name;
    }
    public String getFavSong() {
        return favSong.getFull();
    }
    public int getNoOfPerformances() {
        return noOfPerformances;
    }
    public double getEarnings() {
        return earnings;
    }
    public static int getTotalPerformances() {
        return totalPerformances;
    }
    public void getData () {
        System.out.println(getName() + " \n Favorite Song: " + getFavSong() + "\n Number of Performances: " + getNoOfPerformances() + "\n Earnings: " + getEarnings());
    }
    public void changeFavSong(Song f){
        favSong = f;
    }
}