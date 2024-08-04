package Clase7;
import java.util.Scanner;

public class LongitudCadena {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese una cadena de texto: ");
        String texto = consola.nextLine();
        int caracteres = texto.length();
        System.out.println("La cadena tiene: "+caracteres+" caracteres");
        consola.close();

    }
}
