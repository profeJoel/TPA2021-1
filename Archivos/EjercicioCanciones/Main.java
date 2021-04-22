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
            File bd = new File("EjercicioCanciones/compilado_canciones.csv");

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

                String[] palabras = linea.split(";");

                System.out.println("N Song: " + palabras[0]);
                palabras[1] = palabras[1].replace("b'","");
                palabras[1] = palabras[1].replace("'","");
                //System.out.println("ID Song:" + palabras[1]);
                //System.out.println("ID Album: " + palabras[2]);
                palabras[3] = palabras[3].replace("b'","");
                palabras[3] = palabras[3].replace("'","");
                //System.out.println("Nombre Album: " + palabras[3]);
                palabras[4] = palabras[4].replace("b'","");
                palabras[4] = palabras[4].replace("'","");
                //System.out.println("ID Artista: " + palabras[4]);
                palabras[5] = palabras[5].replace("b'","");
                palabras[5] = palabras[5].replace("'","");
                //System.out.println("nombre artista: " + palabras[5]);
                palabras[6] = palabras[6].replace("b'","");
                palabras[6] = palabras[6].replace("'","");
                //System.out.println("Titulo: " + palabras[6]);
                //System.out.println("Anho: " + palabras[7]);

                String IDSong = palabras[1];
                int IDAlbum = Integer.parseInt(palabras[2]);
                String nombreAlbum = palabras[3];
                String IDArtist = palabras[4];
                String nombreArtist = palabras[5];
                String titulo = palabras[6];
                int year = Integer.parseInt(palabras[7]);

                artistaAuxiliar = new Artist(IDArtist, nombreArtist);
                cancionAuxiliar = new Song(IDSong, titulo, artistaAuxiliar);
                albumAuxiliar = new Album(IDAlbum, nombreAlbum, year, artistaAuxiliar);
                albumAuxiliar.addSong(cancionAuxiliar);

                artistas.add(artistaAuxiliar);
                canciones.add(cancionAuxiliar);
                albumes.add(albumAuxiliar);

                /*System.out.println(artistas.get(0));
                System.out.println(canciones.get(0));
                System.out.println(albumes.get(0));*/
                if(Integer.parseInt(palabras[0]) >= 100)
                    break;
            }
            lector.close();
            System.out.println("cant Artistas: " + artistas.size());
            System.out.println("cant Canciones: " + canciones.size());
            System.out.println("cant Albumes: " + albumes.size());
        } catch (FileNotFoundException e) {
            //TODO: handle exception
            System.out.println("Ocurrio un error al leer el archivo");
            e.printStackTrace();

        }

        
    }
}
