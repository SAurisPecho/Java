package Clase16;
import java.util.Scanner;

public class FibonacciMejorado {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        try {
            System.out.print("Ingresar la posición de un número en la serie de Fibonacci: ");
            int posicion = consola.nextInt();

            if (posicion < 0) {
                System.out.println("La posición debe ser un número entero no negativo.");
                return;
            } else {
                int primero = 0;
                int segundo = 1;
                int resultado = 0;

                if (posicion == 0) {
                    resultado = 0;
                } else if (posicion == 1) {
                    resultado = 1;
                } else {
                    for (int i = 2; i <= posicion; i++) {
                        resultado = primero + segundo;
                        primero = segundo;
                        segundo = resultado;
                    }
                }
                System.out.println("El número en la posición " + posicion + " es: " + resultado);
            }
        } catch (Exception e) {
            System.out.println("Ocurrio un error!");
        } finally {
            consola.close();
        }
        
    }
}
