import java.util.Arrays;
import java.util.Scanner;

public class Comparacion {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int[] array1 = {15, 25, 35, 45, 55};
        int[] array2 = {15, 85, 35, 45, 65};
        boolean resp = Arrays.equals(array1, array2);
        if (resp) {
            System.out.println("Los arreglos son iguales.");
        } else {
            System.out.println("Los arreglos no son iguales.");
        }
        consola.close();
    }
}
