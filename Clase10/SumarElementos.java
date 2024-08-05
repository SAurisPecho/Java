package Clase10;
import java.util.Scanner;

public class SumarElementos {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int[] array = {5,6,7};
        int suma = array[0]+array[1]+array[2];
        // System.out.println("La suma de los 3 elementos del array es: "+(array[0]+array[1]+array[2]));
        System.out.println("La suma de los 3 elementos del array es: "+suma);
        consola.close();
    }
}
