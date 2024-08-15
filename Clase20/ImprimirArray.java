package Clase20;
import java.util.Arrays;
import java.util.Scanner;

public class ImprimirArray {
    public static Scanner consola = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4};
        String[] palabras = {"hola", "como", "estas"};
        int[][] casillas = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        String[][] abecedario = {
            {"a", "b", "c"},
            {"d", "e", "f"},
            {"g", "h", "i"}
        };
        imprimirArray(numeros);
        imprimirArray(palabras);
        imprimirArray(casillas);
        imprimirArray(abecedario);
    }

    public static void imprimirArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void imprimirArray(String[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void imprimirArray(int[][] array) {
        System.out.println("[");
        for (int[] fila : array) {
            imprimirArray(fila);
        }
        System.out.println("]");
    }

    public static void imprimirArray(String[][] array) {
        System.out.println("[");
        for (String[] fila : array) {
            imprimirArray(fila);
        }
        System.out.print("]");        
    }
}
