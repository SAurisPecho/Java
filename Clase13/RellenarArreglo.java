import java.util.Arrays;
import java.util.Scanner;

public class RellenarArreglo {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        try {
            int tamanio;
            int numero;
            do {
                System.out.println("Ingrese el tamaño del arreglo: ");
                tamanio = consola.nextInt();
                System.out.println("Numero con el que quiera rellenarlo: ");
                numero = consola.nextInt();
            } while (tamanio < 1 );
            int[] array = new int[tamanio];
            Arrays.fill(array, numero);
            System.out.println("El array es: "+Arrays.toString(array));
        } catch (Exception e) {
            System.out.println("Ocurrio un error!");
        } finally {
            consola.close();
        }
    }
}
