package EjercicioCanciones;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            //File bd = new File("EjercicioCanciones/compilado_canciones.csv");
            File bd = new File("EjercicioCanciones/SongCSV.csv");

            Scanner lector = new Scanner(bd);

            ArrayList<Artist> artistas = new ArrayList<Artist>();
            Artist artistaAuxiliar;

            ArrayList<Song> canciones = new ArrayList<Song>();
            Song cancionAuxiliar;

            ArrayList<Album> albumes = new ArrayList<Album>();
            Album albumAuxiliar;

            String linea = lector.nextLine();

            while(lector.hasNextLine()){
                linea = lector.nextLine();
                //System.out.println(linea);

                //String[] palabras = linea.split(";");
                String[] palabras = linea.split(",");

                //System.out.println("N Song: " + palabras[0]);
                //System.out.println("ID Song: " + palabras[1]);
                //System.out.println("ID Album: " + palabras[2]);
                //System.out.println("Name Album: " + palabras[3]);
                //System.out.println("ID Artist: " + palabras[4]);
                //System.out.println("Latitud: " + palabras[5]);
                //System.out.println("Location: " + palabras[6]);
                //System.out.println("Long: " + palabras[7]);
                //System.out.println("Name Artist: " + palabras[8]);
                //System.out.println("Dance: " + palabras[9]);
                //System.out.println("Duration: " + palabras[11]);
                //System.out.println("Key: " + palabras[12]);
                //System.out.println("Key: " + palabras[13]);
                //System.out.println("Tempo: " + palabras[14]);
                //System.out.println("Time: " + palabras[15]);
                //System.out.println("Title: " + palabras[16]);
                //System.out.println("Year: " + palabras[17]);
                //System.out.println("\n\n");

                palabras[1] = palabras[1].replace("\"b'","");
                palabras[1] = palabras[1].replace("'\"","");
                palabras[3] = palabras[3].replace("\"b'","");
                palabras[3] = palabras[3].replace("'\"","");
                palabras[4] = palabras[4].replace("\"b'","");
                palabras[4] = palabras[4].replace("'\"","");
                palabras[8] = palabras[8].replace("\"b'","");
                palabras[8] = palabras[8].replace("'\"","");
                palabras[16] = palabras[16].replace("\"b'","");
                palabras[16] = palabras[16].replace("'\"","");
                palabras[16] = palabras[16].replace("\"b\"","");
                palabras[16] = palabras[16].replace("\"\"","");

                String IDSong = palabras[1];
                int IDAlbum = Integer.parseInt(palabras[2]);
                String nombreAlbum = palabras[3];
                String IDArtist = palabras[4];
                String nombreArtist = palabras[8];
                String titulo = palabras[16];
                int year = Integer.parseInt(palabras[17]);

                cancionAuxiliar = new Song(IDSong, titulo);
                albumAuxiliar = validarAlbum(new Album(IDAlbum, nombreAlbum, year), albumes);

                if(nombreArtist.contains(";")){
                    String[] autores = nombreArtist.split(";");
                    for(String author : autores){
                        artistaAuxiliar = validarArtista(new Artist(IDArtist, author), artistas);

                        cancionAuxiliar.addAuthor(artistaAuxiliar);
                        albumAuxiliar.addAuthor(artistaAuxiliar);
                    }
                }
                else{
                    artistaAuxiliar = validarArtista(new Artist(IDArtist, nombreArtist), artistas);

                    cancionAuxiliar.addAuthor(artistaAuxiliar);
                    albumAuxiliar.addAuthor(artistaAuxiliar);
                }
                
                albumAuxiliar.addSong(cancionAuxiliar);
                canciones.add(cancionAuxiliar);
                //albumes.add(albumAuxiliar);


                /*System.out.println(artistas.get(0));
                System.out.println(canciones.get(0));
                System.out.println(albumes.get(0));
                if(Integer.parseInt(palabras[0]) >= 100)
                    break;
                */
            }
            lector.close();
            System.out.println("cant Artistas: " + artistas.size());
            System.out.println("cant Canciones: " + canciones.size());
            System.out.println("cant Albumes: " + albumes.size());

            imprimirArtista(artistas, 2021);
            imprimirCancion(canciones, 328);
            //imprimirAlbum(albumes, 328);
            imprimirAlbum(albumes, "Donde Estan Los Ladrones");

        } catch (FileNotFoundException e) {
            //TODO: handle exception
            System.out.println("Ocurrio un error al leer el archivo");
            e.printStackTrace();

        }

        
    }


    //Método para validación de artistas en la lista
    public static Artist validarArtista(Artist nuevoArtista, ArrayList<Artist> lista){
        if(lista.contains(nuevoArtista))
        {
            Artist recuperado;
            int indiceEncontrado;
            indiceEncontrado = lista.indexOf(nuevoArtista);//identifico el indice del author en el array
            recuperado = lista.get(indiceEncontrado); //obtengo el OBJETO ARTIST existente en el array
            nuevoArtista = recuperado; // reemplazo el author en el texto con el existente en el array
        }
        else
            lista.add(nuevoArtista);

        return nuevoArtista;
    }

    //Método para validación de artistas en la lista
    private static Album validarAlbum(Album nuevoAlbum, ArrayList<Album> lista){
        if(lista.contains(nuevoAlbum))
        {
            Album recuperado;
            int indiceEncontrado;
            indiceEncontrado = lista.indexOf(nuevoAlbum);//identifico el indice del author en el array
            recuperado = lista.get(indiceEncontrado); //obtengo el OBJETO ARTIST existente en el array
            nuevoAlbum = recuperado; // reemplazo el author en el texto con el existente en el array
        }
        else
            lista.add(nuevoAlbum);

        return nuevoAlbum;
    }

    private static void imprimirArtista(ArrayList<Artist> lista, int i){
        Artist a = lista.get(i);
        System.out.println(a);
    }

    private static void imprimirCancion(ArrayList<Song> lista, int i){
        Song s = lista.get(i);
        System.out.println(s);
    }
    
    private static void imprimirAlbum(ArrayList<Album> lista, int i){
        Album a = lista.get(i);
        System.out.println(a);
    }
    private static void imprimirAlbum(ArrayList<Album> lista, String name){
        Album aux = new Album(0,name,0);
        int i = lista.indexOf(aux);
        Album a = lista.get(i);
        System.out.println(a);
    }
}
