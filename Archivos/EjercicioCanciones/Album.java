package EjercicioCanciones;

import java.util.ArrayList;

public class Album{
    private int ID;
    private String name;
    private int year;
    private Artist author;
    private ArrayList<Song> track;

    public Album(int ID, String name, int year, Artist author){
        this.ID = ID;
        this.name = name;
        this.year = year;
        this.author = author;
        this.track = new ArrayList<Song>();
    }

    public void addSong(Song s){
        this.track.add(s);
    }

    public String toString(){
        return "Album: " + this.name + "(" + this.ID + ") - " + this.author + "[" + this.year + "]\n" + this.track;
    }

}