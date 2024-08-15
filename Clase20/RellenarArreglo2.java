package Clase20;
import java.util.Scanner;
import java.util.Arrays;

public class RellenarArreglo2 {
    public static Scanner consola = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Tamaño del array");
        int tamaño = obtenerNum();
       
        int[] array = new int[tamaño];
        
        rellenarArray(array);

        System.out.println("Arreglo: "+Arrays.toString(array));
    }

    public static int obtenerNum () {
        System.out.print("Ingrese un numero: ");
        return consola.nextInt();
    }

    public static void rellenarArray(int[] array){
        int inicial = 0;
        int fin;
        while (inicial < array.length) {
            System.out.println("Numero con el que quiera rellenarlo ");
            int numero = obtenerNum(); 

            System.out.print("Escriba un indice final (debe ser mayor o igual que " + inicial + " y menor que " + array.length + "): ");
            fin = consola.nextInt(); 

            if (fin < inicial || fin >= array.length) {
                System.out.println("Valores no validos");
                continue;
            }
            
            for (int i = inicial; i <= fin; i++) {
                array[i] = numero;
            }

            inicial = fin + 1;
        }
    }
}
