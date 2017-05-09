package hagai.edu.recyclerviewdemos;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hagai Zamir on 09-May-17.
 */

public class SongDataSource {
    public  static List <SongItem> getSongs () {
        ArrayList<SongItem> songs = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            songs.add(new SongItem("Hello" , "Adelle",R.drawable.addle, "" , "4:23"));
            songs.add(new SongItem("Hello" , "Frank",R.drawable.frank_sinatra, "" , "3:23"));
            songs.add(new SongItem("Hello" , "Shlomo",R.drawable.shlome_arzi, "" , "3:45"));
            songs.add(new SongItem("Hello" , "Beatles",R.drawable.beatles, "" , "4:23"));

        }


        return  songs;
    }

}
