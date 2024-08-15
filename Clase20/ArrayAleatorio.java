package Clase20;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayAleatorio {
    public static Scanner consola = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Numeros de rango inferior y superior ");
        int num1 = obtenerNum();
        int num2 = obtenerNum();

        System.out.println("Tamaño del array");
        int tamaño = obtenerNum();

        int[] array = new int[tamaño];
        array = crearArray(array, num1, num2);
        
        System.out.println("Array: "+Arrays.toString(array));
    }

    public static int obtenerNum () {
        System.out.print("Ingrese un numero: ");
        return consola.nextInt();
    }

    public static int numeroAleatorio(int n1, int n2) {
        return (int)(Math.random()*(n2-n1+1)+n1);
    }

    public static int[] crearArray(int[] array, int num1, int num2){
        for (int i = 0; i < array.length; i++) {
            array[i] = numeroAleatorio(num1, num2);
        }
        Arrays.sort(array);
        return array;
    }
}
