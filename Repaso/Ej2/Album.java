package Ej2;

public class Album {
    private Cancion [] canciones;
    private int contador;

    public Album(){
        this.canciones = new Cancion[4];
        this.contador = 0;
    }

    public int numeroCanciones(){
        return this.contador;
    }

    public Cancion dameCancion(int i){
        return this.canciones[i];
    }

    public void grabaCancion(int i, Cancion c){
        this.canciones[i] = c;
    }

    public void agregar(Cancion c){
        if(this.contador <= 4){
            this.canciones[contador] = c;
            this.contador++;
        }
        else
            System.out.println("No se puede Agregar mas canciones");
    }

    public void elimina(int i){
        this.canciones[i] = null;
        this.contador = i;
    }
}
