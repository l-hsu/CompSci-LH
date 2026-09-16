public class SongTester {
    public static void main(String[] args) {
        Song song1 = new Song("Blinding Lights", "The Weeknd", 180);
        System.out.println(song1.getDurationMinutes());   
        System.out.println(song1.getArtistInitial());    
        System.out.println(song1.getTitleLength());    
        Song original = new Song("Blinding Lights", "The Weeknd", 180);
        Song alias = original;
        alias.setArtist("Weeknd");
        System.out.println(original.getArtist()); 
        Song a = new Song("Blinding Lights", "The Weeknd", 180);
        Song b = new Song("Blinding Lights", "The Weeknd", 180);
        System.out.println(a == b);        // false - different objects
        System.out.println(a.equals(b));   // true  - same title and artist
    
    }   
}
