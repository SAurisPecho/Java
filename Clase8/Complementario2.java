package Clase8;
import java.util.Scanner;

public class Complementario2 {
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        try {
            System.out.print("Ingrese un número entre 1 y 30: ");
            int numeroLimite = consola.nextInt();
            if (numeroLimite < 1 || numeroLimite > 30) {
                System.out.println("El número debe estar entre 1 y 30.");
            }
            int numeroAleatorio = (int) (Math.random() * numeroLimite) + 1;
            double raizNumero = Math.sqrt(numeroAleatorio);
            System.out.println("La raíz cuadrada del número aleatorio es: " + raizNumero);
            if (esPrimo(numeroAleatorio)) {
                System.out.println("El número aleatorio " + numeroAleatorio + " es un número primo.");
            } else {
                System.out.println("El número aleatorio " + numeroAleatorio + " no es un número primo.");
            }
            System.out.println("Número aleatorio generado: " + numeroAleatorio);
            System.out.println("Raíz cuadrada del número aleatorio: " + raizNumero);
        } catch (Exception e) {
            System.out.println("Error: Entrada inválida. Por favor, ingrese un número entero.");
        } 
        consola.close();
    }
}