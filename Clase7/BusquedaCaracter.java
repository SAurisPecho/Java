package Clase7;
import java.util.Scanner;

public class BusquedaCaracter {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String palabra = consola.nextLine();
        System.out.print("Ingrese un caracter de esa palabra: ");
        char caracter = consola.next().charAt(0);
        int carActer = palabra.indexOf(caracter);
        if (carActer != -1 ) {
            System.out.println("El caracter '"+caracter+"' si se encuentra en la palabra: "+palabra);
        } else {
            System.out.println("El caracter '"+caracter+"' no se encuentra en la palabra: "+palabra);
        }
        consola.close();
    }
}
