import java.util.Arrays;
import java.util.Scanner;

public class Complement {    
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        try {
            System.out.print("Ingrese el tamaño del array: ");
            int tamanio = consola.nextInt();
            int[] array = new int[tamanio];
            int indInicial = 0;
            int indFinal = 0;
            while (indFinal < tamanio) {
                System.out.print("Ingrese el numero para rellenar el array: ");
                int num = consola.nextInt();
                System.out.print("Ingrese el índice final (debe ser mayor que " + indFinal + " y menor que " + tamanio + "): ");
                indFinal = consola.nextInt();
                if (indFinal <= indInicial || indFinal > tamanio) {
                    System.out.println("Índice no válido. Debe ser mayor que " + indFinal + " y menor que " + tamanio);
                } else {
                    Arrays.fill(array, indInicial, indFinal, num);
                    indInicial = indFinal;
                }
            }
            System.out.println("Array es: "+Arrays.toString(array));
        } catch (Exception e) {
            System.out.println("Ocurrio un error! ");
        } finally {
            consola.close();
        }
        consola.close();
    }
}

