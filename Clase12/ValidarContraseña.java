package Clase12;
import java.util.Scanner;

public class ValidarContraseña {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        String contraseñaCorrecta = "secreto";
        System.out.print("Ingrese la contraseña: ");
        String contraseña = consola.next();
        while (!contraseña.equals(contraseñaCorrecta)) {
            System.out.print("Contraseña incorrecta, vuelva a intentarlo: ");
            contraseña = consola.next();
        }
        System.out.println("Contraseña correcta!");
        consola.close();
    }
}
