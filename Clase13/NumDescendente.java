import java.util.Scanner;
import java.util.Arrays;

public class NumDescendente {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        try {
            int[] array = new int[10];
            for (int i = 0; i < array.length; i++) {
                int numero = (int) (Math.random()*100)+1;
                array[i] = numero;
            }
                System.out.println("Array: "+Arrays.toString(array));
                Arrays.sort(array);
            for (int i = 0; i < array.length/2; i++) {
                int nuevo = array[i];
                array[i] = array[array.length-1-i];
                array[array.length-1-i] = nuevo;
            }
                System.out.println("Array descendente: "+Arrays.toString(array));
        } finally {
            consola.close();
        }
    }
}
