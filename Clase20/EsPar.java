package Clase20;
import java.util.Scanner;

public class EsPar {
    public static Scanner consola = new Scanner(System.in);

    public static void main(String[] args) {
        int numero = solicitarNumero();
        if (esPar(numero)) {
            System.out.println("El "+numero+" es par.");
        } else {
            System.out.println("El "+numero+" es impar.");
        }
    }

    public static Integer solicitarNumero() {
        Integer numero = null;
        System.out.println("Por favor ingrese un número:");
          do {
                try {
                    numero = consola.nextInt();
                } catch (Exception e) {
                    consola.nextLine();
                    System.out.println("No ingresó un número, intente nuevamente:");
                }
        } while (numero == null);
        return numero;
    }

    public static boolean esPar(int num) {
        return num % 2 == 0;
    }
}