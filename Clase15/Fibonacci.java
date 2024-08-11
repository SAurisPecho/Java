package Clase15;
import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        int[] array = new int[8];
        int longitud = 8;
        int primero = 0;
        int segundo = 1;
        int i = 0;
        try {
            System.out.println("Los primeros " + longitud + " términos de la serie de Fibonacci son:");
            while (i < longitud) {
                if (i <= 1) {
                    System.out.println(i);
                    array[i] = i;
                } else {
                    int suma = primero + segundo;
                    System.out.println(suma);
                    primero = segundo;
                    segundo = suma;
                    array[i] = suma;
                }
                i++;
            }
            
            System.out.println(Arrays.toString(array));
        } catch (Exception e) {
            System.out.println("Ocurrio un error!");
        } 
    }
}
