public class Song {
    private String title;
    private String artist;
    private int durationSeconds;

    public Song(String title, String artist, int durationSeconds){
        this.title = title;
        this.artist = artist;
        this.durationSeconds = durationSeconds;
    }
    public Song(){
        this.title = "Unknown";
        this.artist = "Unknown";
        this.durationSeconds = 0;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getArtist(){
        return artist;
    }
    public void setArtist(String artist){
        this.artist = artist;
    }
    public int getDurationSeconds(){
        return durationSeconds;
    }
    public void setDurationSeconds(int durationSeconds){
        this.durationSeconds = durationSeconds;
    }
    public double getDurationMinutes(){
        return (double)this.durationSeconds / 60;
    }
    public String getArtistInitial(){
        String letter1 = artist.substring(0,1);
        return letter1;
    }
    public int getTitleLength(){
        int titlelength = title.length();
        return titlelength;
    }
    public String getLabel(){
        String string = this.title+" - "+this.artist;
        return string;
    }
    public String toString(){
        String toString = "\""+this.title+"\" by the "+this.artist+" ("+this.durationSeconds+"s)";
        return toString;
    }
    public boolean equals(Song other){
        boolean same = this.title.equals(other.title) && this.artist.equals(other.artist);
        return same;
    }
}
