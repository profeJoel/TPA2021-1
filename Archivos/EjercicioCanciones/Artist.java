package EjercicioCanciones;

public class Artist {
    private String ID;
    private String name;

    public Artist(String ID, String name){
        this.ID = ID;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public String toString(){
        return "Artist: " + this.name + "(" + this.ID + ")";
    }
}
