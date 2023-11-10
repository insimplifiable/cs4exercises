package exer3;

public class Main {
    public static void main(String arg[]) {
        CityData city1 = new CityData("Chiba-shi", "Kanto", 975000);
        CityData city2 = new CityData("Hamamatsu-shi", "Chubu", 791000);
        CityData city3 = new CityData("Kanazawa-shi", "Chubu", 463000);
        
        city1.outputData(); city2.outputData(); city3.outputData();
        
        Song song1 = new Song("PoPiPo", "LamazeP", 2008);
        Song song2 = new Song("FLOWER TAIL", "yuukiss", 2011);
        Song song3 = new Song("Hiasobi", "Camellia", 2022);
        Song song4 = new Song("AMARA(Daimiraidennou)", "sasakure.UK", 2022);
        
        Singer singer1 = new Singer("Hatsune Miku", song1);
        Singer singer2 = new Singer("KAITO", song2);
        
        System.out.println("\nBefore:");
        singer1.getData(); singer2.getData();
        
        singer1.performForAudience(12000);
        singer1.changeFavSong(song3);
        singer1.performForAudience(singer2, song4, 2500);
        
        System.out.println("\nAfter:");
        singer1.getData(); singer2.getData();
        
        System.out.println("\nTotal Performances (Solo and Duo): " + Singer.getTotalPerformances());
    }
}
