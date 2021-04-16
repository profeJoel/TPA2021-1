package Archivos;

/** Clase File dentro del paquete IO */
import java.io.File;
import java.io.IOException;

public class ejemplo1 {
    public static void main(String[] args) {
        File archivo = new File("Archivos/hola.txt");//nombre del archivo
        /**Rutas en Windows, Linux o en Mac *
        - Referenciales : partes desde el punto en donde se ejecuta. ej: Archivos/hola.txt
        - Absoluto: es toda la ubicación del archivo. ej: C:\Users\joelm\OneDrive\Escritorio\TPA2021-1\Archivos\hola.txt
        */

        try {
            System.out.println("Nuevo Archivo Creado: " + archivo.createNewFile());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("Se puede leer? " + archivo.canRead());
        System.out.println("Se puede escribir? " + archivo.canWrite());
        System.out.println("Existe el archivo? " + archivo.exists());
        System.out.println("Largo (bytes [cant. caracteres]): " + archivo.length());
        System.out.println("Nombre archivo: " + archivo.getName());
        //System.out.println("otros archivos: " + archivo.list());
        //System.out.println("Crear nuevos directorios: " + archivo.mkdir());
        //System.out.println("Archivo Eliminado: " + archivo.delete());


        //System.out.println("Ruta Absoluta: " + archivo.getAbsolutePath());
    }
}
