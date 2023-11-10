public class Main {
    public static void main(String arg[]) {
        CityData city1 = new CityData("Chiba-shi", "Kanto", 975000);
        CityData city2 = new CityData("Hamamatsu-shi", "Chubu", 791000);
        CityData city3 = new CityData("Kanazawa-shi", "Chubu", 463000);
        
        city1.outputData(); city2.outputData(); city3.outputData();
        
        Song song1 = new Song("All Too Well", "Taylor Swift", 2012);
        Song song2 = new Song("You're So Vain", "Carly Simon", 1972);
        
        Singer singer = new Singer("Taylor Swift", song1);
        
        System.out.println("\n" + singer.name + " (Before)\n Favorite Song: " + singer.favSong.full + "\n Number of Performances: " + singer.noOfPerformances + "\n Earnings: " + singer.earnings);
        
        singer.performForAudience(12);
        singer.changeFavSong(song2);
        
        System.out.println(singer.name + " (After)\n Favorite Song: " + singer.favSong.full + "\n Number of Performances: " + singer.noOfPerformances + "\n Earnings: " + singer.earnings);
    }
}
