package EjercicioCanciones;

public class Song {
    private String ID;
    private String title;
    private Artist author;

    public Song(String ID, String title, Artist author){
        this.ID = ID;
        this.title = title;
        this.author = author;
    }

    public String toString(){
        return "Song: " + this.title + "(" + this.ID + ") - " + this.author;
    }
}
