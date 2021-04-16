package Ej2;

public class Cancion {
    //<visibilidad> <tipo_dato> <nombre_variable>
    private String titulo;
    private String autor;

    //Métodos <visibilidad> <tipo_dato> <nombre_metodo> (<parametros>...)
    public Cancion(String t, String a){
        this.titulo = t;
        this.autor = a;
    }

    public Cancion(){
        this.titulo = "";
        this.autor = "";
    }

    public String dameTitulo(){
        return this.titulo;
    }

    public String dameAutor(){
        return this.autor;
    }

    public void ponTitulo(String t){
        this.titulo = t;
    }

    public void ponAutor(String a){
        this.autor = a;
    }
}
