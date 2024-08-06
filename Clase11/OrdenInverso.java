import java.util.Scanner;

public class OrdenInverso {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int[] array = {5,6,8,9,10,20};
        for (int i = array.length-1; i >= 0; i--) {
            System.out.print(" " + array[i]);
        }
        consola.close();
    }
}
