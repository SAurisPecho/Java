package Clase16;
import java.util.Arrays;
import java.util.Scanner;

public class NumPrimosPlus {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        try {
            System.out.print("Ingrese la cantidad deseada de números primos que deseas obtener: ");
            int cantidad = consola.nextInt();

            if (cantidad <= 0) {
                System.out.println("La cantidad debe ser un número entero positivo.");
                return;
            }

            int[] primos = new int[cantidad];
            int contador = 0;       //contar los números primos encontrados
            int numero = 2;      // Empezar desde el primer número primo
            
            while (contador < cantidad) {
                boolean esPrimo = true;

                for (int i = 2; i < numero; i++) {
                    if (numero % i == 0) {
                        esPrimo = false;
                        break;
                    }
                }

                if (esPrimo) {
                    primos[contador] = numero; // Guardar el número primo en el array
                    contador++;
                }

                numero++;
            }
            System.out.println("Números primos encontrados:");
            System.out.println(Arrays.toString(primos));

        } catch (Exception e) {
            System.out.println("Ocurrio un error!");
        } finally {
            consola.close();
        }
    }
}
