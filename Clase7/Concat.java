package Clase7;
import java.util.Scanner;

public class Concat {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingresar su nombre: ");
        String nombre = consola.nextLine();
        System.out.print("Ingresar su apellido: ");
        String apellido = consola.nextLine();
        String nombreCompleto = nombre.concat(" ").concat(apellido);
        System.out.println("Su nombre completo es: "+ nombreCompleto );
        consola.close();
    }
}
