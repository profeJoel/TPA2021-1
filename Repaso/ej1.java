import java.util.Scanner;

public class ej1{
    public static void main(String[] args) {
        int [] numeros = new int[10];
        int i;

        Scanner lector = new Scanner(System.in);

        for(i = 0; i < 10; i++)
        {
            System.out.println("Ingrese un valor:");
            numeros[i] = lector.nextInt();
        }

        System.out.println("Elementos en orden inverso:");
        for(i = 9; i >= 0; i--)
        {
            System.out.println(numeros[i]);
        }
    }
}