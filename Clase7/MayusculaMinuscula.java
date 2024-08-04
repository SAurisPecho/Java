package Clase7;
import java.util.Scanner;

public class MayusculaMinuscula {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase = consola.nextLine();
        String cambio1 = frase.toUpperCase();
        System.out.println("En mayuscula: "+cambio1);
        String cambio2 = frase.toLowerCase();
        System.out.println("En minuscula: "+cambio2);
        consola.close();
    }
}
