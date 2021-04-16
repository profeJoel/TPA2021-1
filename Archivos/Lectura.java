package Archivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class Lectura {
    public static void main(String[] args) {
        try {
            File archivo = new File("Archivos/cancionero.txt");
            Scanner lector = new Scanner(archivo);

            while(lector.hasNextLine()){
                String linea = lector.nextLine();
                System.out.println(linea);
            }
            lector.close();

        } catch (FileNotFoundException e) {
            //TODO: handle exception
            System.out.println("Ocurrio un error al leer el archivo");
            e.printStackTrace();

        }
    }
    
}
