package Clase16;
import java.util.Scanner;

public class GraficoBarras {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        try {
            int[] numeros = new int[4];
            for (int i = 0; i < 4 ; i++) {
                int numero;
                    do {
                        System.out.print("Ingrese un número entre 1 y 20 para la posición " + (i + 1) + ": ");
                        numero = consola.nextInt();
                        if (numero < 1 || numero > 20) {
                            System.out.println("Número fuera de rango. Por favor, ingrese un número entre 1 y 20.");
                        }
                    } while (numero < 1 || numero > 20);
                numeros[i] = numero;
            }

            System.out.println("Grafico de barras");
            for (int numero : numeros) {
                if (numero < 10) {
                    System.out.print("0"+numero+" ");
                } else {
                    System.out.print(numero+" ");
                }
                for (int j = 0; j < numero; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        } catch (Exception e) {
            System.out.println("Ocurrio un error!");
        }
        consola.close();
    }
}
