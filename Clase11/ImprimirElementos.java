import java.util.Scanner;

public class ImprimirElementos {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int[] array = {1,2,3,4,5,6};
        for (int i = 0; i < array.length; i++) {
            System.out.println("El elemento "+i+" es: "+array[i]);
        }
        consola.close();
    }
}

