package EjercicioCanciones;

import java.util.ArrayList;
import java.util.Objects;

public class Album{
    private int ID;
    private String name;
    private int year;
    private ArrayList<Artist> author;
    private ArrayList<Song> track;

    public Album(int ID, String name, int year, Artist author){
        this.ID = ID;
        this.name = name;
        this.year = year;
        this.author = new ArrayList<Artist>();
        this.author.add(author);
        this.track = new ArrayList<Song>();
    }
    
    public Album(int ID, String name, int year){
        this.ID = ID;
        this.name = name;
        this.year = year;
        this.author = new ArrayList<Artist>();
        this.track = new ArrayList<Song>();
    }

    public void addAuthor(Artist author){
        if(!this.author.contains(author))
            this.author.add(author);
    }

    public void addSong(Song s){
        this.track.add(s);
    }

    public String toString(){
        return "Album: " + this.name + "(" + this.ID + ") - " + this.author + "[" + this.year + "]\n" + this.track;
    }

    @Override
    public boolean equals(Object o) {      
        // Mismo objeto o misma instancia
        if (this == o)
            return true;
        // objeto Nulo
        if (o == null)
            return false;

        // valida la clase del objeto entregado
        if (getClass() != o.getClass())
            return false;

        Album a = (Album) o; //Cast del tipo de la clase
        // field comparison
        return Objects.equals(name, a.name)
                && Objects.equals(name, a.name);
    }

}