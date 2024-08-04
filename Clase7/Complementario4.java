package Clase7;
import java.util.Scanner;

public class Complementario4 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase = consola.nextLine();
        String sinEspacios = frase.replace(" ", "");
        int longitud = sinEspacios.length();
        System.out.println("La frase tiene: "+longitud+" caracteres, sin contar los espacios");
        consola.close();
    }
}
