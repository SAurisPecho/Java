package Clase7;
import java.util.Scanner;

public class Complementario3 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingrese la primera palabra: ");
        String palabra1 = consola.nextLine();
        System.out.print("Ingrese la segunda palabra: ");
        String palabra2 = consola.nextLine();
        boolean igual = palabra1.equals(palabra2);
        System.out.println("Las palabras son iguales: "+igual);
        consola.close();
    }
}
