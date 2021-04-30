package EjercicioCanciones;

import java.util.Objects;

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

        Artist a = (Artist) o; //Cast del tipo de la clase
        // field comparison
        return Objects.equals(name, a.name)
                && Objects.equals(name, a.name);
    }
}
