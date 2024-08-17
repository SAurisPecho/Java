import java.util.Scanner;

public class NumPrimosRecursividad {
    public static Scanner consola = new Scanner(System.in);

    public static void main(String[] args) {
        int numero;
        do {
            System.out.print("Números Primos\nIntroduce un número (0 para salir): ");
            numero = consola.nextInt();
            
            if (numero != 0) {
                if (esPrimoRecursivo(numero, 2)) {
                    System.out.println(numero + " es un número primo.");
                } else {
                    System.out.println(numero + " no es un número primo.");
                }
            }
        } while (numero != 0);
    }

    public static boolean esPrimoRecursivo(int numero, int divisor) {
        if (numero <= 1) {
            return false;
        }
        if (divisor > Math.sqrt(numero)) {
            return true;
        }
        if (numero % divisor == 0) {
            return false;
        }
        return esPrimoRecursivo(numero, divisor + 1);
    }
}
