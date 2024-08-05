package Clase10;
import java.util.Scanner;

public class Buscador {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int[] array = {5,7,9};
        System.out.print("Ingrese un numero: ");
        int numero = consola.nextInt();
        boolean numBuscado = false;
        if ( array[0] == numero) {
            numBuscado = true;
        }
        if ( array[1] == numero) {
            numBuscado = true;
        }
        if ( array[2] == numero) {
            numBuscado = true;
        }
        System.out.print("¿El numero: "+numero+" se encuentra en el array? "+numBuscado);
        consola.close();
    }
}
