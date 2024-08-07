import java.util.Arrays;
import java.util.Scanner;

public class BusqBinaria {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int[] array = { 15, 25, 35, 45, 55, 65, 75, 85, 95, 100};
        System.out.println("El arreglo ordenado: "+Arrays.toString(array));
        System.out.print("Elige el numero que desea buscar: ");
        int resp = consola.nextInt();
        int indice = Arrays.binarySearch(array, resp);
        if (indice >= 0) {
            System.out.println("El valor " + resp + " se encuentra en el índice " + indice + " del arreglo.");
             for (int i = 0; i < array.length; i++) {
                System.out.println("array["+i+"]"+" "+array[i]);
                }
        } else {
        System.out.println("El valor " + resp + " no se encuentra en el arreglo.");
        }
       
        consola.close();
    }
}
