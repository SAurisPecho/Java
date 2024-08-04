package Clase7;
import java.util.Scanner;

public class Complementario2 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingrese una frase con espacios al inicio y final: ");
        String frase = consola.nextLine();
        String eliminacion = frase.trim();
        System.out.println("La frase ahora es:"+eliminacion);
        consola.close();
    }
}
