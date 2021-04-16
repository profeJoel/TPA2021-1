package Ej2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        String titulo, autor;

        System.out.println("Ingrese el Nombre de la Cancion: ");
        titulo = lector.nextLine();
        System.out.println("Ingrese el Autor de la Cancion: ");
        autor = lector.nextLine();

        Cancion c1 = new Cancion(titulo, autor);

        System.out.println("La cancion ingresada es: ");
        System.out.println(" - titulo: " + c1.dameTitulo());
        System.out.println(" - autor: " + c1.dameAutor());

        /*************************************************** */
        
        Cancion c2 = new Cancion();
        System.out.println("La cancion ingresada es: ");
        System.out.println(" - titulo: " + c2.dameTitulo());
        System.out.println(" - autor: " + c2.dameAutor());

        System.out.println("Ingrese el Nombre de la Cancion: ");
        titulo = lector.nextLine();
        System.out.println("Ingrese el Autor de la Cancion: ");
        autor = lector.nextLine();

        c2.ponTitulo(titulo);
        c2.ponAutor(autor);

        System.out.println("La cancion ingresada es: ");
        System.out.println(" - titulo: " + c2.dameTitulo());
        System.out.println(" - autor: " + c2.dameAutor());


        
        /*************************************************** */
        /********************* Ej 5 ************************ */
        /*************************************************** */

        Album omonimo = new Album();

        omonimo.agregar(c1);
        omonimo.agregar(c2);


        System.out.println("Cantidad de canciones: " + omonimo.numeroCanciones());
        System.out.println("Cancion 1: " + omonimo.dameCancion(0).dameTitulo() + " (" + omonimo.dameCancion(0).dameAutor() + ")");
        System.out.println("Cancion 2: " + omonimo.dameCancion(1).dameTitulo() + " (" + omonimo.dameCancion(1).dameAutor() + ")");

    }
}
