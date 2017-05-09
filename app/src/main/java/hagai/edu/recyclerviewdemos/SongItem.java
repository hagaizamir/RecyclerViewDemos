package hagai.edu.recyclerviewdemos;

/**
 * Created by Hagai Zamir on 09-May-17.
 */

public class SongItem {
    private final String title;
    private final  String artist;
    private final int thumbnailResId;
    //private final string thumbnail;
    private final  String lyrics;
    private final  String duration;

    public SongItem(String title, String artist, int thumbnailResId, String lyrics, String duration) {
        this.title = title;
        this.artist = artist;
        this.thumbnailResId = thumbnailResId;
        this.lyrics = lyrics;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getThumbnailResId() {
        return thumbnailResId;
    }

    public String getLyrics() {
        return lyrics;
    }

    public String getDuration() {
        return duration;
    }
}
