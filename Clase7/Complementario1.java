package Clase7;
import java.util.Scanner;

public class Complementario1 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase = consola.nextLine();
        System.out.print("Ingrese el caracter de la frase que quiere cambiar: ");
        char aCambiar = consola.next().charAt(0);
        System.out.print("Ingrese el caracter nuevo que quiere agregar: ");
        char cambio = consola.next().charAt(0);
        String nuevaFrase = frase.replace(aCambiar, cambio);
        System.out.println("la frase cambiada es: "+nuevaFrase);
        consola.close();
    }
}
