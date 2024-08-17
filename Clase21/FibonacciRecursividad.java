import java.util.Scanner;

public class FibonacciRecursividad {
    public static Scanner consola = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.print("Ingresar la posición de un número en la serie de Fibonacci: ");
        int posicion = consola.nextInt();

        if (posicion < 0) {
            System.out.println("La posición debe ser un número entero no negativo.");
            return;
        } else {
            int resultado = calcularFibonacciRecursivo(posicion);
            System.out.println("El número en la posición " + posicion + " es: " + resultado);
        }
    }

    public static int calcularFibonacciRecursivo(int posicion) {
        if (posicion == 0) {
            return 0;
        } else if (posicion == 1) {
            return 1;
        } else {
            return calcularFibonacciRecursivo(posicion-1)+calcularFibonacciRecursivo(posicion-2);
        }
    }
}
