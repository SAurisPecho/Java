import java.util.Arrays;
import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("El array es: "+Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            System.out.println("array ["+i+"] ="+array[i]);
        }
        int inicial;
        int fin;
            do {
                System.out.print("Escriba un indice inicial: ");
                inicial = consola.nextInt();
                System.out.print("Escriba un indice final: ");
                fin = consola.nextInt(); 
                if (inicial > fin || inicial < 0 || fin >= array.length || fin < 0 || inicial >= fin ) {
                    System.out.println("Valores no validos");
                }
            } while (inicial > fin || inicial < 0 || fin >= array.length || fin < 0 || inicial >= fin );
        int[] nuevoArray = Arrays.copyOfRange(array, inicial, fin +1 );
        System.out.println(Arrays.toString(nuevoArray));
        consola.close();
    }
}
