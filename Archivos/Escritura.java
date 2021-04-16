package Archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Escritura {
    public static void main(String[] args) {
        /*
        try{
            File nuevoArchivo = new File("Archivos/cancionero.txt");
            if(nuevoArchivo.createNewFile()){
                System.out.println("Archivo Creado: " + nuevoArchivo.getName());
            } else {
                System.out.println("El archivo descrito ya existe");
            }
        }catch(IOException e){
            System.out.println("Ocurrio un error en la creacion");
            e.printStackTrace();
        }*/

        /**ESCRITURA DENTRO DEL ARCHIVO */
        try {
            FileWriter escritor = new FileWriter("Archivos/cancionero.txt", true);
            escritor.write("Torero - Chayanne\n");
            escritor.write("Noa Noa - Juan Gabriel\n");
            escritor.append("La venia Bendita - Marco Antonio Solis");
            escritor.close();
            System.out.println("La escritura fue realizada con exito");
            
        } catch (IOException e) {
            //TODO: handle exception
            System.out.println("Ocurrio un error en la Escritura");
            e.printStackTrace();
        }

    }
    
}
